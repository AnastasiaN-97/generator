fun main() {
    var list = LaptopGroupGenerator(1, 8)
    list.generator()
}

val brandArr = arrayOf("Lenovo", "HP", "ASUS", "Aser", "Dell", "MSI", "Honor", "GYGABYTE", "Huawey")
val diagonalArr = arrayOf(11.6, 13, 13.3, 13.5, 14, 15.6, 16, 16.1, 17.3)
val cpuArr = arrayOf("Core i9", "Core i7", "Core i5", "Core i3", "Ryzon 9", "Ryzon 7", "Ryzon 5", "Ryzon 3")
val ramArr = arrayOf(4, 8, 12, 16, 32, 64)

val diagonalArraySize = diagonalArr.size
val brandArraySize = brandArr.size
val cpuArraySize = cpuArr.size
val ramArraySize = ramArr.size


class Laptop{
    var brand = brandArr[(0..(brandArraySize-1)).random()]
    var diagonal = diagonalArr[(0..(diagonalArraySize-1)).random()]
    var cpu = cpuArr[(0..(cpuArraySize-1)).random()]
    var ram = ramArr[(0..(ramArraySize-1)).random()]
}

class LaptopGroupGenerator(_min: Int, _max: Int) {

    var i = if (_min < _max) (_min.._max).random() else (_max.._min).random()
    var l = 0
    var listGenerate: MutableList<Laptop> = mutableListOf()
    
    fun generator(){
        while (l<i){
            val laptop = Laptop()
            listGenerate.add(laptop)
            println("Ноутбук от компании ${laptop.brand} диагональю ${laptop.diagonal}\", процессором ${laptop.cpu} и оперативной памятью ${laptop.ram}ГБ")
            l++
        }
    }
}