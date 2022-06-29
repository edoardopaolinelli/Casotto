# Casotto
Piattaforma di gestione di uno chalet 
   <b>Casotto</b>, progetto realizzato in <b>Spring</b> per il corso di laurea <b>L-31</b> presso <b>Unicam</b>, <i>nell'anno accademico 2021/2022</i>, realizzato dagli studenti Edoardo Paolinelli, Filippo Fracascia e Renzo Proietti per l'esame di <b>Ingegneria del Software</b> 
    <br><br><b>
  # Panoramica e funzionalità 

Il fine dell'applicativo proposto è quello di permettere l'utilizzo del sistema sia da parte del proprietario, dei dipendendi ma anche dell'end user.
Mettendo a disposizione specifiche azioni possibili in base al tipo di utente autenticato.

Il funzionamento di base del sistema si fonda sulla possibilità per ogni utente di prenotare ombrelloni/lettini, prenotare attività ludiche dello chalet ma anche la possibilità di ordinazione al bar della spiaggia.

Il funzionamento avanzato del sistema richiede una registrazione e un login da parte dell'utente. Ciò permette, per esempio, di poter in ogni momento visualizzare i posti liberi di una determinata attività o gli ombrelloni disponibili.
Ciò permette anche di poter associare un ordine bar ad uno specifico utente registrato/loggato.
  
  # Processo di Sviluppo


Per sviluppare l'applicativo è stato scelto di seguire il processo standardizzato **Unified Process (UP)**, processo iterativo incrementale, utilizzando come strumento di lavoro **Visual Paradigm** basato sul **Unified Modeling Language (UML)**.

Attualmente sono state svolte 3 iterazioni dove è stato possibile effettuare l'analisi dei requisi, la progettazione del sistema, l'implementazione e la fase di testing.
   
Le varie iterazioni hanno dato origine ai seguenti artefatti:
- Diagramma dei casi d'uso: raccolta e specifica dei requisiti e funzionalità del sistema.
- Diagramma classi di analisi: identificano i concetti che è necessario il sistema rappresenti e sia capace di manipolare.
- Diagrammi di sequenza: descrivono come le classi di analisi interagiscono tra di loro per realizzare il comportamento definito nei casi d'uso.
- Diagramma classi di progetto: realizzato sfruttando il principio LRG (Low Representational Gap) per derivare le classi di progetto partendo dalle classi di analisi, il diagramma verrà utilizzato per le attività di implementazione.
- Code Base

   # Tecnologie utilizzate

Il lato backend si basa sul linguaggio **Java** , la cui scrittura e gestione, anche sotto l'ottica della sicurezza, sono state rese possibili grazie al framework **Spring Boot**. Per il testing del codice scritto ci si è affidati al framework **SpingBootTest** mentre per il building automatizzato del sistema si è impiegato il tool **Gradle**.

Per quanto concerne la persistenza delle informazioni processate a livello di backend si è deciso di sfruttare i servizi offerti da **MYSQL DATABASE** e dal relativo framework per linguaggio Java.


Per quanto concerne lo scambio di informazioni tra client e server si è deciso di sfruttare lo standard Java Persistent API (JPA).
  # Autori 

- [Edoardo Paolinelli](https://github.com/edoardopaolinelli)
- [Filippo Fracascia](https://github.com/filippofracascia)
- [Renzo Proietti](https://github.com/renzoproietti)

