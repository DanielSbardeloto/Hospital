create table Paciente(id integer generated by default as identity primary key, nome varchar(255), idade Integer, doença varchar(255),
CPF varchar(11), rua varchar(255),numero Integer, bairro varchar(255), cidade varchar(255), 
UF varchar(2), dia date);