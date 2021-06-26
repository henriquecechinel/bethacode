-- Henrique Cechinel

create database atividade01;
create schema escola;


/* PAISES */
create table escola.paises(
	id bigint,
	nome varchar(80) UNIQUE,
	populacao bigint,
	constraint PK_PAISES primary key (id)
);

select * from escola.paises

insert into escola.paises
	 values (1, 'Brasil', 214560229);
	
insert into escola.paises
	 values (2, 'Estados Unidos', 333585287);
	 
insert into escola.paises
	 values (3, 'Canadá', 37590000);
	 
insert into escola.paises
	 values (4, 'China', 1398567000);
	 
insert into escola.paises
	 values (5, 'Reino Unido', 66065675);
	 
insert into escola.paises
	 values (6, 'Paraguai', 7045987);

	

/* ESTADOS */
create table escola.estados(
	id bigint,
	nome varchar(80) UNIQUE,
	populacao int,
	i_pais bigint,
	constraint PK_ESTADOS primary key (id),
	foreign key (i_pais) references escola.paises(id)
);

select * from escola.estados

insert into escola.estados
	 values (1, 'Santa Catarina', 7165000, 1);
	
insert into escola.estados
	 values (2, 'Califórnia', 39051000, 2);
	
insert into escola.estados
	 values (3, 'Alberta', 4067175, 3);
	
insert into escola.estados
	 values (4, 'Hainan', 9258000, 4);
	
insert into escola.estados
	 values (5, 'Inglaterra', 55098000, 5);
	
insert into escola.estados
	 values (6, 'Alto Paraguay', 11473, 6);



/* CIDADES */
create table escola.cidades(
	id bigint,
	nome varchar(80) UNIQUE,
	populacao int,
	i_estado bigint,
	constraint PK_CIDADES primary key (id),
	foreign key (i_estado) references escola.estados(id)
);

select * from escola.cidades

insert into escola.cidades
	 values (1, 'Cocal do Sul', 15860, 1);
	
insert into escola.cidades
	 values (2, 'Los Angeles', 3967000, 2);
	
insert into escola.cidades
	 values (3, 'Calgary', 1336000, 3);
	
insert into escola.cidades
	 values (4, 'Sanya', 536000, 4);
	
insert into escola.cidades
	 values (5, 'Londres', 8982000, 5);
	
insert into escola.cidades
	 values (6, 'Salto Laguna', 6532, 6);



/* ALUNOS */
create table escola.alunos(
	id bigint,
	nome varchar(80),
	matricula int UNIQUE,
	i_cidade bigint,
	dataNascimento date,
	constraint PK_ALUNOS primary key (id),
	foreign key (i_cidade) references escola.cidades(id)
);

select * from escola.alunos

insert into escola.alunos
	 values (1, 'Henrique Cechinel', 12021, 1, '1999-08-01');
	
insert into escola.alunos
	 values (2, 'Pablo Escobar', 22021, 2, '1950-04-23');
	
insert into escola.alunos
	 values (3, 'Alexandre Punta', 142021, 3, '1993-04-09');
	
insert into escola.alunos
	 values (4, 'Reinold Juliano', 87021, 4, '1987-08-28');
	
insert into escola.alunos
	 values (5, 'João Pedro da Silva', 3021, 5, '1990-11-11');
	
insert into escola.alunos
	 values (6, 'Bruno Master', 442021, 6, '1988-12-19');



/* PROFESSORES */
create table escola.professores(
	id bigint,
	nome varchar(80),
	matricula int UNIQUE,
	i_cidade bigint,
	dataNascimento date,
	constraint PK_PROFESSORES primary key (id),
	foreign key (i_cidade) references escola.cidades(id)
);

select * from escola.professores

insert into escola.professores
	 values (1, 'Juliano Caju', 112019, 1, '1989-02-23');
	
insert into escola.professores
	 values (2, 'Denny Torres', 012017, 2, '1991-01-10');
	
insert into escola.professores
	 values (3, 'Zeigth Geist', 172020, 3, '1977-03-24');
	
insert into escola.professores
	 values (4, 'Unknown Person', 042018, 4, '1989-11-22');
	
insert into escola.professores
	 values (5, 'Pedro Cabral', 032015, 5, '1985-08-20');
	
insert into escola.professores
	 values (6, 'Beto Torres', 012012, 6, '1989-01-01');


	
/* MATERIAS */
create table escola.materias(
	id bigint,
	descricao varchar(100) UNIQUE,
	constraint PK_MATERIA primary key (id)
);

select * from escola.materias

insert into escola.materias
	 values (1, 'Geografia');
	
insert into escola.materias
	 values (2, 'Matemática');
	
insert into escola.materias
	 values (3, 'Inglês');
	
insert into escola.materias
	 values (4, 'Português');
	
insert into escola.materias
	 values (5, 'Ciências');
	
insert into escola.materias
	 values (6, 'História');



/* TURMAS */
create table escola.turmas(
	id bigint,
	descricao varchar(100),
	i_materia bigint,
	i_professor bigint,
	constraint PK_TURMAS primary key (id),
	foreign key (i_materia) references escola.materias(id),
	foreign key (i_professor) references escola.professores(id)
);

select * from escola.turmas

insert into escola.turmas
	 values (1, 'AZUL/1B', 1, 1);
	
insert into escola.turmas
	 values (2, 'AMARELO/1A', 2, 2);
	
insert into escola.turmas
	 values (3, 'AZUL/1A', 3, 3);
	
insert into escola.turmas
	 values (4, 'LARANJA/1C', 4, 4);
	
insert into escola.turmas
	 values (5, 'AMARELO/2C', 5, 5);
	
insert into escola.turmas
	 values (6, 'LARANJA/1A', 6, 6);



/* FREQUENCIAS */
create table escola.frequencias(
	id bigint,
	i_turma bigint,
	i_aluno bigint,
	dataAula date,
	presenca boolean,
	constraint PK_FREQUENCIAS primary key (id),
	foreign key (i_turma) references escola.turmas(id),
	foreign key (i_aluno) references escola.alunos(id)
);

select * from escola.frequencias

insert into escola.frequencias
	 values (1, 1, 1, '2021-06-05', true);
	 
insert into escola.frequencias
	 values (2, 2, 2, '2021-01-15', true);
	 
insert into escola.frequencias
	 values (3, 3, 3, '2021-09-25', true);
	 
insert into escola.frequencias
	 values (4, 4, 4, '2021-04-07', true);
	 
insert into escola.frequencias
	 values (5, 5, 5, '2021-11-12', true);
	 
insert into escola.frequencias
	 values (6, 6, 6, '2021-03-09', true);
	 
	

/* CONSULTAS */
	
-- 01 
select *
  from escola.alunos a
 where a.i_cidade = 1
 
 -- 02
select *
  from escola.turmas t
 where t.i_professor = 1
 
-- 03
   select count(*) qtd_alunos, c.nome cidade
     from escola.alunos a
left join escola.cidades c ON (a.i_cidade = c.id)
    where c.populacao < 10000
 group by a.i_cidade, c.nome
 
-- 04
select nome, dataNascimento from (
	select nome, dataNascimento from escola.alunos alu
	union all
	select nome, dataNascimento from escola.professores pro
) as datas
 	
-- 05
   select a.nome aluno, c.nome cidade
     from escola.alunos a 
left join escola.cidades c on (a.i_cidade = c.id)

-- 06
select count(case when presenca = 'true' then 1 else null end) presentes, count(case when presenca = 'false' then 1 else null end) ausentes
  from escola.frequencias f
 where f.dataAula = '2021-06-05'
