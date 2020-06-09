import { Injectable } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
import { Resolve, ActivatedRouteSnapshot, Routes, Router } from '@angular/router';
import { Observable, of, EMPTY } from 'rxjs';
import { flatMap } from 'rxjs/operators';

import { Authority } from 'app/shared/constants/authority.constants';
import { UserRouteAccessService } from 'app/core/auth/user-route-access-service';
import { IRecherche, Recherche } from 'app/shared/model/recherche.model';
import { RechercheService } from './recherche.service';
import { RechercheComponent } from './recherche.component';
import { RechercheDetailComponent } from './recherche-detail.component';
import { RechercheUpdateComponent } from './recherche-update.component';

@Injectable({ providedIn: 'root' })
export class RechercheResolve implements Resolve<IRecherche> {
  constructor(private service: RechercheService, private router: Router) {}

  resolve(route: ActivatedRouteSnapshot): Observable<IRecherche> | Observable<never> {
    const id = route.params['id'];
    if (id) {
      return this.service.find(id).pipe(
        flatMap((recherche: HttpResponse<Recherche>) => {
          if (recherche.body) {
            return of(recherche.body);
          } else {
            this.router.navigate(['404']);
            return EMPTY;
          }
        })
      );
    }
    return of(new Recherche());
  }
}

export const rechercheRoute: Routes = [
  {
    path: '',
    component: RechercheComponent,
    data: {
      authorities: [Authority.USER],
      defaultSort: 'id,asc',
      pageTitle: 'suiviRecherchesApp.recherche.home.title',
    },
    canActivate: [UserRouteAccessService],
  },
  {
    path: ':id/view',
    component: RechercheDetailComponent,
    resolve: {
      recherche: RechercheResolve,
    },
    data: {
      authorities: [Authority.USER],
      pageTitle: 'suiviRecherchesApp.recherche.home.title',
    },
    canActivate: [UserRouteAccessService],
  },
  {
    path: 'new',
    component: RechercheUpdateComponent,
    resolve: {
      recherche: RechercheResolve,
    },
    data: {
      authorities: [Authority.USER],
      pageTitle: 'suiviRecherchesApp.recherche.home.title',
    },
    canActivate: [UserRouteAccessService],
  },
  {
    path: ':id/edit',
    component: RechercheUpdateComponent,
    resolve: {
      recherche: RechercheResolve,
    },
    data: {
      authorities: [Authority.USER],
      pageTitle: 'suiviRecherchesApp.recherche.home.title',
    },
    canActivate: [UserRouteAccessService],
  },
];
