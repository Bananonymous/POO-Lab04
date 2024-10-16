# Code Documentation pour la classe Main et la classe Int

## Auteurs

- Léon Surbeck
- Victor Nicolet

## Introduction

Ce rapport documente les choix de conception pour les laboratoires Java, avec une implémentation utilisant des classes pour encapsuler des entiers et des méthodes de tri utilisant un tri à bulles. Le code est structuré en deux classes principales : `Int` et `Main`. Ce document inclut également les tests effectués, leurs résultats pour une meilleure compréhension.

## Choix de Conception

### Classe `Int`

La classe `Int` encapsule un entier privé et expose les méthodes suivantes :

- `Int(int newInt)` : Constructeur qui initialise la valeur de l'entier.
- `toInt()` : Renvoie la valeur de l'entier encapsulé.
- `setInt(int newInt)` : Définit une nouvelle valeur pour l'entier.
- `toString()` : Renvoie la valeur de l'entier sous forme de chaîne.
- `swapCurrObjValue(Int toSwap)` : Permet d'échanger la valeur de l'objet actuel avec celle d'un autre objet `Int`.
- `swapArrayElem(Int[] arr, int elem1, int elem2)` : Méthode statique pour échanger deux éléments dans un tableau d'objets `Int`.
- `swapObjValue(Int obj1, Int obj2)` : Méthode statique pour échanger les valeurs de deux objets `Int`.

### Classe `Main`

La classe `Main` gère l'exécution du programme principal :

- `stringToInt(String s)` : Convertit une chaîne en entier tout en validant la saisie.
- `bubbleSort(Int[] arr, int n)` : Implémente un tri à bulles sur un tableau d'objets `Int`, en utilisant la méthode `swapCurrObjValue` pour échanger les éléments.

Le programme prend en entrée des arguments en ligne de commande, les convertit en entiers, les trie, et affiche les résultats avant et après le tri.

## Tests et Résultats

### Tests effectués

Les tests effectués sont les suivants :

1. **Test de conversion de chaîne en entier** : Testé avec des chaînes valides et invalides.
2. **Test de tri à bulles** : Testé avec différentes séquences d'entiers pour vérifier le bon fonctionnement du tri et des échanges.

#### Cas de test 1 : Conversion de chaîne

Entrée : `"-123", "456", "abc"`

- Résultat attendu : `-123`, `456`, et une exception pour `"abc"`.
- Résultat obtenu :
  - Conversion réussie pour `"-123"` et `"456"`.
  - Exception levée pour `"abc"` : `IllegalArgumentException: Caractère non numérique trouvé`.

#### Cas de test 2 : Tri à bulles

Entrée : `[3, -2, 7, 1]`

- Résultat attendu : `[-2, 1, 3, 7]`
- Résultat obtenu : `[-2, 1, 3, 7]`

### Conclusion

Les tests se sont déroulés avec succès. Le programme gère correctement la conversion des chaînes en entiers et trie les tableaux d'objets `Int` en utilisant la méthode de tri à bulles.

## Structure des Fichiers

- `src/Int.java` : Contient la classe `Int`.
- `src/Main.java` : Contient la classe `Main` et le point d'entrée du programme.
