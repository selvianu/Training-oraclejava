create table student(id number primary key,dateofbirth date not null);
drop table student;
insert into student values(110, DATE '2013-11-15');
commit;
select * from student;