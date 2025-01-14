# Rapport Jeu de la Vie LIFAPOO

**Diego GALFRÉ**  
**Delshad KADDO**  
**Licence 3 Informatique**  

## Introduction

Le Jeu de la Vie, créé par John Conway en 1970, est une simulation qui se déroule sur une grille 2D où chaque cellule peut être morte ou vivante. Les cellules évoluent selon des règles simples, et cette dynamique produit des motifs de plus en plus complexes.  
Le Jeu de la Vie est aussi un concept qui permet d'hypothétiser comment la vie a pu émerger sur Terre, en montrant comment des processus simples peuvent conduire à des comportements complexes et évolutifs, comme dans les systèmes biologiques.  

### Les règles sont les suivantes :
- Une cellule vivante avec moins de 2 voisines vivantes meurt (sous-population).
- Une cellule vivante avec 2 ou 3 voisines vivantes reste vivante.
- Une cellule vivante avec plus de 3 voisines vivantes meurt (sur-population).
- Une cellule morte avec exactement 3 voisines vivantes devient vivante (reproduction).

## Projet

Ce projet a été développé dans le cadre du cours **LIFAPOO** à l'Université Claude Bernard Lyon 1. Il a pour objectif de mettre en pratique les concepts de la **programmation orientée objet** à travers la réalisation d'une simulation du Jeu de la Vie. Ce projet nous a permis d'appliquer des notions fondamentales telles que la gestion des classes, des objets, ainsi que des interactions entre différents composants d'un programme dans un environnement graphique.  

Coder ce jeu en **Java** est intéressant car il permet de bénéficier de la programmation orientée objet pour organiser le code, d’outils comme **Swing** pour créer des interfaces graphiques.

Le projet a débuté avec un code de base qui générait simplement une grille affichant des états aléatoires à chaque génération. À partir de ce point de départ, l'objectif était d'enrichir cette simulation en ajoutant des fonctionnalités supplémentaires, l'implémentation des règles, la possibilité d'interagir avec la grille, et l'ajout de mécanismes de contrôle de la simulation, comme la gestion de la vitesse, la pause, et l'activation de différents modes de fonctionnement.

