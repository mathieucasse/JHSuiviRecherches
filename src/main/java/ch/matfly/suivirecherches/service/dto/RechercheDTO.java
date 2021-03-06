package ch.matfly.suivirecherches.service.dto;

import java.time.Instant;
import javax.validation.constraints.*;
import java.io.Serializable;
import ch.matfly.suivirecherches.domain.enumeration.OffreDeService;
import ch.matfly.suivirecherches.domain.enumeration.ResOffreDeService;

/**
 * A DTO for the {@link ch.matfly.suivirecherches.domain.Recherche} entity.
 */
public class RechercheDTO implements Serializable {
    
    private Long id;

    private Instant date;

    private String poste;

    private String location;

    private Boolean assignationORP;

    @Min(value = 1)
    @Max(value = 100)
    private Integer txactivite;

    private OffreDeService offredeservice;

    private ResOffreDeService resoffredeservice;

    private String motifres;


    private Long entPrestataireId;

    private String entPrestataireName;

    private Long entFinaleId;

    private String entFinaleName;

    private Long contactId;

    private String contactLastName;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean isAssignationORP() {
        return assignationORP;
    }

    public void setAssignationORP(Boolean assignationORP) {
        this.assignationORP = assignationORP;
    }

    public Integer getTxactivite() {
        return txactivite;
    }

    public void setTxactivite(Integer txactivite) {
        this.txactivite = txactivite;
    }

    public OffreDeService getOffredeservice() {
        return offredeservice;
    }

    public void setOffredeservice(OffreDeService offredeservice) {
        this.offredeservice = offredeservice;
    }

    public ResOffreDeService getResoffredeservice() {
        return resoffredeservice;
    }

    public void setResoffredeservice(ResOffreDeService resoffredeservice) {
        this.resoffredeservice = resoffredeservice;
    }

    public String getMotifres() {
        return motifres;
    }

    public void setMotifres(String motifres) {
        this.motifres = motifres;
    }

    public Long getEntPrestataireId() {
        return entPrestataireId;
    }

    public void setEntPrestataireId(Long entrepriseId) {
        this.entPrestataireId = entrepriseId;
    }

    public String getEntPrestataireName() {
        return entPrestataireName;
    }

    public void setEntPrestataireName(String entrepriseName) {
        this.entPrestataireName = entrepriseName;
    }

    public Long getEntFinaleId() {
        return entFinaleId;
    }

    public void setEntFinaleId(Long entrepriseId) {
        this.entFinaleId = entrepriseId;
    }

    public String getEntFinaleName() {
        return entFinaleName;
    }

    public void setEntFinaleName(String entrepriseName) {
        this.entFinaleName = entrepriseName;
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long personneId) {
        this.contactId = personneId;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public void setContactLastName(String personneLastName) {
        this.contactLastName = personneLastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RechercheDTO)) {
            return false;
        }

        return id != null && id.equals(((RechercheDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "RechercheDTO{" +
            "id=" + getId() +
            ", date='" + getDate() + "'" +
            ", poste='" + getPoste() + "'" +
            ", location='" + getLocation() + "'" +
            ", assignationORP='" + isAssignationORP() + "'" +
            ", txactivite=" + getTxactivite() +
            ", offredeservice='" + getOffredeservice() + "'" +
            ", resoffredeservice='" + getResoffredeservice() + "'" +
            ", motifres='" + getMotifres() + "'" +
            ", entPrestataireId=" + getEntPrestataireId() +
            ", entPrestataireName='" + getEntPrestataireName() + "'" +
            ", entFinaleId=" + getEntFinaleId() +
            ", entFinaleName='" + getEntFinaleName() + "'" +
            ", contactId=" + getContactId() +
            ", contactLastName='" + getContactLastName() + "'" +
            "}";
    }
}
