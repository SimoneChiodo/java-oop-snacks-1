# Java OOP Snaks

## Snack 1: Studente

- Crea una classe `Studente` con attributi:
  - `nome` (String)
  - `cognome` (String)
  - `età` (int)
  
- Implementa un costruttore che accetta 3 parametri per inizializzare gli attributi.

- Aggiungi un metodo che restituisce una stringa concatenata dei dati, ad esempio:
  `"Anselmo Bitta, 24 anni"`.

---

## Snack 2: Gestione di un Conto

- Crea una classe `ContoBancario` con attributi:
  - `numeroConto` (String o int)
  - `saldo` (double), inizializzato a 0 nel costruttore

- Costruttore con parametro `numeroConto`.

- Metodi pubblici:
  - `deposita(double importo)` → aumenta il saldo
  - `preleva(double importo)` → diminuisce il saldo se sufficiente
  - `getSaldo()` → restituisce il saldo corrente

---

## Snack 3: Registro Studenti

- Crea una classe `RegistroStudenti` con:
  - Array privato di oggetti `Studente`
  
- Costruttore senza parametri che inizializza l’array (può essere dinamico, tipo `ArrayList`)

- Metodo pubblico per aggiungere uno studente al registro.

- Metodo per stampare la lista completa degli studenti, mostrando nome, cognome ed età.

---

Questi esercizi aiutano a consolidare:

- Definizione di classi e attributi
- Costruttori con parametri e senza
- Metodi di lettura e modifica
- Gestione di array di oggetti
- Concetto di incapsulamento e accesso ai dati
