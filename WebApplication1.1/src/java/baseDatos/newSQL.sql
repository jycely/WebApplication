SELECT producto.idProducto AS Id, producto.nombreProducto AS Nombre, producto.cantidad AS Cantidad,
SUM(venta.valorVenta) AS ValorTotalVenta, 
SUM(compra.valorCompra) AS ValorTotalCompra,
SUM(venta.valorVenta) - SUM(compra.valorCompra) AS Ganancias
FROM producto, venta, compra
WHERE venta.idProducto=7 AND compra.idProducto=7
