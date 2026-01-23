package org.example.tacheservice.entites;





import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.tacheservice.enums.Priorite;
import org.example.tacheservice.enums.StatutTache;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "taches")
@NoArgsConstructor @AllArgsConstructor
public class Tache {

    @Id
    private String id;
    private String titre;
    private String description;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private Priorite priorite;
    private StatutTache statut;

    private String categorie;
    List<String> tags = new ArrayList<>();
    private int niveauUrgence ;
    private LocalDateTime dateDerniereModification;
    private Long idUser;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Priorite getPriorite() {
        return priorite;
    }

    public void setPriorite(Priorite priorite) {
        this.priorite = priorite;
    }

    public LocalDateTime getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDateTime dateFin) {
        this.dateFin = dateFin;
    }

    public StatutTache getStatut() {
        return statut;
    }

    public void setStatut(StatutTache statut) {
        this.statut = statut;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public int getNiveauUrgence() {
        return niveauUrgence;
    }

    public void setNiveauUrgence(int niveauUrgence) {
        this.niveauUrgence = niveauUrgence;
    }

    public LocalDateTime getDateDerniereModification() {
        return dateDerniereModification;
    }

    public void setDateDerniereModification(LocalDateTime dateDerniereModification) {
        this.dateDerniereModification = dateDerniereModification;
    }
    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

}
