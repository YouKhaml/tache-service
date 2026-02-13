package org.example.tacheservice.dto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.tacheservice.enums.Priorite;
import org.example.tacheservice.enums.StatutTache;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor @AllArgsConstructor
public class TacheDTO {


    private String id;
    private String titre;
    private String description;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private Priorite priorite;
    private StatutTache statut;

    private String categorie;
    private int niveauUrgence ;

    // 🔥 CALCUL DYNAMIQUE (PAS EN BASE)
    private boolean enRetard;

    // =========================
    // LOGIQUE MÉTIER
    // =========================
    public void calculerRetard() {
        this.enRetard =
                statut != StatutTache.TERMINEE
                        && dateFin != null
                        && dateFin.isBefore(LocalDateTime.now());
    }

//    private String userUsername ;

    public String getId() { return id;}

    public void setId(String id) { this.id = id;}

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

    public LocalDateTime getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDateTime dateFin) {
        this.dateFin = dateFin;
    }

    public Priorite getPriorite() {
        return priorite;
    }

    public void setPriorite(Priorite priorite) {
        this.priorite = priorite;
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


    public int getNiveauUrgence() {
        return niveauUrgence;
    }

    public void setNiveauUrgence(int niveauUrgence) {
        this.niveauUrgence = niveauUrgence;
    }

    public boolean isEnRetard() {
        return enRetard;
    }

    public void setEnRetard(boolean enRetard) {
        this.enRetard = enRetard;
    }


//    public String getUserUsername() {
//        return userUsername;
//    }
//
//    public void setUserUsername(String userUsername) {
//        this.userUsername = userUsername;
//    }
}
