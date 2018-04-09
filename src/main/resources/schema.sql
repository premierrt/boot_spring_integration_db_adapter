CREATE TABLE usluga(
 id int(7) NOT NULL AUTO_INCREMENT,
 name varchar2(100),
 PRIMARY KEY (id)
);

CREATE TABLE usluga_powiazanie(
id int(7) NOT NULL AUTO_INCREMENT,
usluga_glowna  int(7) NOT NULL,
usluga_zalezna int(7) NOT NULL,
typ_powiazania varchar2(20),
status varchar2(20),
bandel boolean,
PRIMARY KEY(id)
)