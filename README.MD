# **Problema 2: 'Merger'**
La classe Merger uneix dues llistes de enters que compleixin les següents condicions:
>- Que la llista estigui en ordre ascendent.
>- Que la llista no tingui elements repetits.

L'exercici s'ha realitzat d'acord amb l'assumpció de que quan no es compleix una de les dues condicions, es llança una **_IlegalArgumentException_**.

## Detall dels casos de test
Sigui $T$ el conjunt de amb la totalitat de llistes d'enters amb llarg finit que es poden construir. Llavors es defineixen els conjunts $V$ i $C$, els quals representen el conjunt amb la llista buida i el conjunt amb les llistes construides que compleixen les dues condicions de la classe <code>Merger</code> respectivament. Es pot deduir que les llistes no buides les separarem entre les que compleixen les condicions i les que no.

Pertant $T = V \cup \overline V = V \cup(C\cup \overline C) = V \cup C\cup \overline C$ , per lo que les llistes d'entrada poden recaure en 3 grups diferents exclusius entre ells.

### Casos de test:
Sigui $A,B$ llistes de enters. Els casos de test són els següents:
1. $A\in V \wedge B \in V$
2. $A\in V \wedge B \in \overline C$
3. $A\in V \wedge B \in C$
4. $A\in C \wedge B \in \overline C$
5. $A,B \in \overline C$
6. $A\in C \wedge B \in C$

Tenint en compte que intercanviar els grups entre $A$ i $B$ no canvia res.

Els resultats esperats de cada cas són els següents, indicats dintre de cada bloc identat:

### $A\in V \wedge B \in V$:
> $R \in V$ (llista buida)
### $A\in V \wedge B \in \overline C$:
> $E \in Exceptions$ ( **_IlegalArgumentException_** )
### $A\in V \wedge B \in C$:
> $R \equiv B$ (llista sense canviar)
### $A\in C \wedge B \in \overline C$
> $E \in Exceptions$ ( **_IlegalArgumentException_** )
### $A,B \in \overline C$
> $E \in Exceptions$ ( **_IlegalArgumentException_** )
### $A\in C \wedge B \in C$
> $R \in Resultats$ ( Resultat d'unir A i B )

## Interficies de test:
- `ThrowableMergeTest` per a les classes de test que han de llençar excepcions (casos 2,4,5)
- `ExpectableMergeTest` per a les classes de test que han de retornar un resultat  (correcte)