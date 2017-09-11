use dblavanderia;
delimiter $$
create procedure spuInsertarPrenda 
  (in aDescripcion varchar(50))
begin
	declare coderror bit;
    declare mensaje varchar(40);
	set adescripcion = lower(aDescripcion);
	if not exists (select * from Tprenda where aDescripcion = descripcion) then
		insert into tPrenda values ( adescripcion,1);
		set CodError=1;
        set Mensaje='Se inserto Prenda';
	else
		select CodError=0;
        set Mensaje='Ya existe la Prenda' ;
	end if;
end $$
