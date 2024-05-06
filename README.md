README
*********************
Tout d'abord on a crée la classe Personne.
Et ensuite de cette classe on a fait hérité les classes:
- Etudiant
- Salarie.

De la Classe Etudiant on a fait hérité les classes:
- Etudiant Boursier 
- Etudiant Non Boursier

De la Classe Salarie on a fait hérité les classes:
- Enseignant Vacataire
- Enseignant Titulaire
- Personnel Adminstratif

On a intégré la classe Clavier

La classe gestion comporte les grandes fonctions comme:
- Ajouter un Etudiant (Boursier/non Boursier)
- Supprimer un Etudiant (Boursier/non Boursier)
- Ajouter un Enseignant(Vacataire/Titulaire)
- Supprimer un Enseignant(Vacataire/Titulaire)

La classe Bureau a une fonction:
qui permet d'ajouter une personne dans le bureau


Le Menu possède un switch case, on a fait appel à un bibliothèque externe qui se nomme scanner
Ceci fait en sorte que l'utilisateur a un contrôle avec le menu derroulant.

lorsque qu'on a finit il y a un input.close qui permet de fermer la bibliothèque car on en a plus besoin pour la suite

Pour Compiler il faut se placer dans le fichier Menu pas le AppJava ni AppVacataire.
car le fichier comporte:
- un fichier bin
- un fichier src.