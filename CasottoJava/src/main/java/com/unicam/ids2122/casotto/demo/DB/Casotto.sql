CREATE TABLE Attivita (
  idAttivita BIGSERIAL NOT NULL,
  name varchar(255),
  description varchar(255),
  maxParticipants int4 NOT NULL,
  actualParticipants int4 NOT NULL,
  "date" date,
  hour int4,
  PRIMARY KEY (idAttivita)
);

CREATE TABLE Ombrellone (
  idOmbrellone BIGSERIAL NOT NULL,
  price float4 NOT NULL,
  ombrelloneType varchar(255),
  PRIMARY KEY (idOmbrellone)
);

CREATE TABLE Piatto (
  idPiatto BIGSERIAL NOT NULL,
  name varchar(255),
  description varchar(255),
  price float4 NOT NULL,
  piattoType varchar(255),
  PRIMARY KEY (idPiatto)
);

CREATE TABLE Lettino (
  idLettino BIGSERIAL NOT NULL,
  price float4 NOT NULL,
  lettinoType varchar(255),
  PRIMARY KEY (idLettino)
);

CREATE TABLE Prenotazione (
  idPrenotazione BIGSERIAL NOT NULL,
  startDate date,
  endDate date,
  prenotationType int4,
  oggettoPrenotato int8,
  Clienteid int8 NOT NULL,
  PRIMARY KEY (idPrenotazione)
);

CREATE TABLE Ordine (
  idOrdine BIGSERIAL NOT NULL,
  price float4 NOT NULL,
  orderedDishes int4,
  startOrder date,
  endOrder date,
  Clienteid int8 NOT NULL,
  PRIMARY KEY (idOrdine)
);

CREATE TABLE Promozione (
  idPromozione BIGSERIAL NOT NULL,
  name varchar(255),
  description varchar(255),
  startDate date,
  endDate date,
  PRIMARY KEY (idPromozione)
);

CREATE TABLE Cliente (
  id BIGSERIAL NOT NULL,
  name varchar(255),
  surname varchar(255),
  email varchar(255),
  guestType varchar(255),
  PRIMARY KEY (id)
);

CREATE TABLE GestoreChalet (
  id BIGSERIAL NOT NULL,
  name varchar(255),
  surname varchar(255),
  email varchar(255),
  guestType varchar(255),
  PRIMARY KEY (id)
);

CREATE TABLE Prenotazione_Cliente (
  ClienteidCliente int8 NOT NULL,
  PrenotazioneidPrenotazione int8 NOT NULL,
  PRIMARY KEY (ClienteidCliente, PrenotazioneidPrenotazione)
);

CREATE TABLE Prenotazione_Attività (
  PrenotazioneidPrenotazione int8 NOT NULL,
  AttivitaidAttivita int8 NOT NULL,
  PRIMARY KEY (PrenotazioneidPrenotazione)
);

CREATE TABLE Prenotazione_Ombrellone (
  PrenotazioneidPrenotazione int8 NOT NULL,
  OmbrelloneidOmbrellone int8 NOT NULL,
  PRIMARY KEY (PrenotazioneidPrenotazione)
);

CREATE TABLE Prenotazione_Lettino (
  PrenotazioneidPrenotazione int8 NOT NULL,
  LettinoidLettino int8 NOT NULL,
  PRIMARY KEY (PrenotazioneidPrenotazione)
);

CREATE TABLE Cliente_Ordine (
  ClienteidCliente int8 NOT NULL,
  OrdineidOrdine int8 NOT NULL,
  PRIMARY KEY (ClienteidCliente, OrdineidOrdine)
);

CREATE TABLE Ordine_Piatto (
  OrdineidOrdine int8 NOT NULL,
  Piattoid int8 NOT NULL,
  quantity int4,
  PRIMARY KEY (OrdineidOrdine, Piattoid)
);

CREATE TABLE UserHandler (
  id int8 NOT NULL,
  token int8 NOT NULL,
  PRIMARY KEY (id, token)
);

CREATE TABLE Piatto_Promozione (
  PiattoidPiatto int8 NOT NULL,
  PromozioneidPromozione int8 NOT NULL,
  PRIMARY KEY (PiattoidPiatto, PromozioneidPromozione)
);

ALTER TABLE
  Prenotazione_Cliente
ADD
  CONSTRAINT FKPrenotazio967778 FOREIGN KEY (ClienteidCliente) REFERENCES Cliente (id);

ALTER TABLE
  Prenotazione_Ombrellone
ADD
  CONSTRAINT FKPrenotazio335853 FOREIGN KEY (PrenotazioneidPrenotazione) REFERENCES Prenotazione (idPrenotazione);

ALTER TABLE
  Prenotazione_Ombrellone
ADD
  CONSTRAINT FKPrenotazio342164 FOREIGN KEY (OmbrelloneidOmbrellone) REFERENCES Ombrellone (idOmbrellone);

ALTER TABLE
  Prenotazione_Attività
ADD
  CONSTRAINT FKPrenotazio91332 FOREIGN KEY (PrenotazioneidPrenotazione) REFERENCES Prenotazione (idPrenotazione);

ALTER TABLE
  Prenotazione_Attività
ADD
  CONSTRAINT FKPrenotazio392658 FOREIGN KEY (AttivitaidAttivita) REFERENCES Attivita (idAttivita);

ALTER TABLE
  Prenotazione_Lettino
ADD
  CONSTRAINT FKPrenotazio374470 FOREIGN KEY (PrenotazioneidPrenotazione) REFERENCES Prenotazione (idPrenotazione);

ALTER TABLE
  Prenotazione_Lettino
ADD
  CONSTRAINT FKPrenotazio196158 FOREIGN KEY (LettinoidLettino) REFERENCES Lettino (idLettino);

ALTER TABLE
  Cliente_Ordine
ADD
  CONSTRAINT FKCliente_Or418035 FOREIGN KEY (ClienteidCliente) REFERENCES Cliente (id);

ALTER TABLE
  Cliente_Ordine
ADD
  CONSTRAINT FKCliente_Or554114 FOREIGN KEY (OrdineidOrdine) REFERENCES Ordine (idOrdine);

ALTER TABLE
  Ordine_Piatto
ADD
  CONSTRAINT FKOrdine_Pia783542 FOREIGN KEY (OrdineidOrdine) REFERENCES Ordine (idOrdine);

ALTER TABLE
  Ordine_Piatto
ADD
  CONSTRAINT FKOrdine_Pia831526 FOREIGN KEY (Piattoid) REFERENCES Piatto (idPiatto);

ALTER TABLE
  Prenotazione_Cliente
ADD
  CONSTRAINT FKPrenotazio168773 FOREIGN KEY (PrenotazioneidPrenotazione) REFERENCES Prenotazione (idPrenotazione);

ALTER TABLE
  Piatto_Promozione
ADD
  CONSTRAINT FKPiatto_Pro267233 FOREIGN KEY (PiattoidPiatto) REFERENCES Piatto (idPiatto);

ALTER TABLE
  Piatto_Promozione
ADD
  CONSTRAINT FKPiatto_Pro525584 FOREIGN KEY (PromozioneidPromozione) REFERENCES Promozione (idPromozione);

ALTER TABLE
  Prenotazione
ADD
  CONSTRAINT FKPrenotazio895675 FOREIGN KEY (Clienteid) REFERENCES Cliente (id);

ALTER TABLE
  Ordine
ADD
  CONSTRAINT FKOrdine229541 FOREIGN KEY (Clienteid) REFERENCES Cliente (id);