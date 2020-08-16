// main function
fun main() {
    val officeOpen = 7
    val now = 20
    val office: String
    if (now > officeOpen) {
        office = "Kantor Sudah Buka"
    } else {
        office = "Kantor Ditutup"
    }

    print(office)
}