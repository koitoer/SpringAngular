drop table Employee if exists;
create table Employee (id integer generated by default as identity (start with 1), name varchar(255), primary key (id));
create table TMPVIRTUALSKU (virtualsku varchar, Sku varchar, Custitemnum varchar,  Custitemdesc varchar, Uom varchar, Uomconv float);

