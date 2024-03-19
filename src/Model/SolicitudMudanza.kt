data class SolicitudMudanza(
    val id: Int,
    val cliente: Cliente,
    val repartidor: Empleado,
    val fecha: String,
    val direccionOrigen: String,
    val direccionDestino: String)
