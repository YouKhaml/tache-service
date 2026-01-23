package org.example.tacheservice.enums;

public enum StatutTache {
    EN_ATTENTE,    // Créée mais pas encore commencée
    EN_COURS,      // En cours de réalisation
    TERMINEE,      // Finalisée
    ANNULEE,       // Annulée par l’utilisateur
    BLOQUEE        // Bloquée (dépendance, problème)
}
