use dblavanderia;
delimiter $$
create procedure spuGenerarCodigoCompra()
begin
	declare aultimo int;
	declare aSgte varchar(6);
	set aultimo=(select Max(cast (right(DocSalida,5))+1) from TComprobante_Compra);
	if (aultimo is null) then 
		set aSgte='G00001';
	else
		set aSgte=(select 'G'+right(replace(str(aultimo,5),' ',0),5));
	end if;
	select aSgte;
	select 'G'+replace(str(max(substring(DocSalida,2,9))+1,9),' ',0) from TComprobante_Compra;
end $$