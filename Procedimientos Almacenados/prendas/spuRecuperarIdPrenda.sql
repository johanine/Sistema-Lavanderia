use dblavanderia;
delimiter $$
create procedure spuRecuperarIdPrenda (
in adescripcion varchar(200))

begin
	select  IdPrenda from  tPrenda
	where adescripcion = Descripcion;
end $$
