use dblavanderia;
delimiter $$
create  procedure spuInsertarCompra (in aDocSalida varchar(12),
								   in aNro varchar(15),
								   in aSerie varchar(15),
								   in aFecha datetime,
								   in aUsuario varchar(50),
								   in aEmpresa varchar(50))
begin
	declare coderror bit;
    declare mensaje varchar(60);
	if not exists (select * from TComprobante_Compra where DocSalida=aDocSalida) then
		insert into TComprobante_Compra values ( aDocSalida,aNro,aSerie,aFecha,aUsuario,aEmpresa);
		set CodError=1; 
        set Mensaje='Se inserto Comprobante de Compra';
	else
		set CodError=0;
        set Mensaje='Ya existe un Comprobante de Compra con el mismo nro';
	end if;
    select coderror,mensaje;
end $$