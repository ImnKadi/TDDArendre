Fake it
2) 
Junit permet de faire des test unitaires et Hamcrest permet de rendre le code lisible. Mockito sert à eecrire plus rapidement le code.
5) La duplication existante pour l’instant dans notre code est la duplication du nom dans la classe Dictionary.


Triangulation
2) Nan il faut les 2 méthodes pour pouvoir tester. Si on ne fait qu'ajouter dans le dictionnaire, on ne pourra pas vérifier ce qu'on a ajouté avec le get. De même, on ne peut pas vérifier ce qu'il ya dans le dictionnaire si on n'ajoute rien dedans.

