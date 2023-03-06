package com.dicoding.mycar

object CarsData {
    private val carBrands = arrayOf(
        "Nissan GTR-34",
        "Toyota Supra",
        "Mazda RX-7",
        "Dodge Charger",
        "Subaru Impreza",
        "Shelby Mustang",
        "BMW M3-GTR",
        "Acura NSX",
        "Ford GT",
        "Mitsubishi Lancer Evo"
    )

    private val carDetails = arrayOf(
        "Year: 2002 | Wheel: AWD | Power: 280HP | Top Speed: 249km/h",
        "Year: 2002 | Wheel: RWD | Power: 220HP | Top Speed: 241km/h",
        "Year: 2002 | Wheel: RWD | Power: 236HP | Top Speed: 250km/h",
        "Year: 1969 | Wheel: RWD | Power: 147HP | Top Speed: 241km/h",
        "Year: 2005 | Wheel: AWD | Power: 280HP | Top Speed: 254km/h",
        "Year: 2015 | Wheel: RWD | Power: 533HP | Top Speed: 249km/h",
        "Year: 2001 | Wheel: RWD | Power: 444HP | Top Speed: 285km/h",
        "Year: 1991 | Wheel: RWD | Power: 270HP | Top Speed: 270km/h",
        "Year: 2005 | Wheel: RWD | Power: 549HP | Top Speed: 330km/h",
        "Year: 2006 | Wheel: RWD | Power: 280HP | Top Speed: 245km/h",
    )

    private val carsImages = intArrayOf(
        R.drawable.skyline,
        R.drawable.supra,
        R.drawable.rx7,
        R.drawable.charger,
        R.drawable.subaru,
        R.drawable.mustang,
        R.drawable.m3gtr,
        R.drawable.nsx,
        R.drawable.fgt,
        R.drawable.evo
    )

    private val  carsRoles = arrayOf(
        "Varian GT-R tiba pada tahun 1999 menggunakan measin RB26DETT dan diklaim memiliki 276 hp. Ada varian M-Spec baru dengan fokus tambahan pada kemewahan.",
        "Supra berkode JZA80 ini jauh lebih hebat dari model sebelumnya. Mesin yang digunakan adalah 2JZ-GE atau 2JZ-GTE turbo berkapasitas 3000 cc. Model yang paling kencang adalah turbo dengan transmisi manual 6 speed, dan mampu dipacu hingga lebih dari 270 km/jam.",
        "Dengan sistem twin-turbo, dimana turbo pertama melalui putaran mesin 1800rpm menghasilkan turbo boost sebesar 10 psi, turbo yang kedua dengan kekuatan 4500rpm menghasilkan 8 psi boost.",
        "Mobil tahun 1968 ini dapat berlari pada mesin V8 5.2 liter standar dan paket kinerja tinggi dan menawarkan mesin HEMI 375 HP atau 425 HP HEMI-",
        "Saat pertama kali lahir, Impreza dibuat Subaru sebagai sedan berdimensi compact. Namun ketika tim balap reli Subaru World Rally Team membutuhkan mobil untuk turun di Group A, maka Subaru pun membangun versi Impreza WRX (World Rally eXperimental).",
        "Muscle car asal Amerika Serikat ini juga dikenal dengan sebutan Cobra, seperti sebutan semua mobil balap yang dikerjakan Shelby. Shelby Mustang pertama adalah GT350, lalu ada pula GT350R khusus balap yang cuma diproduksi 35 unit.",
        "BMW M3 GTR merupakan salah satu edisi spesial dan terbatas. Dikatakan spesial karena mobil ini merupakan versi balap BMW M3 yang dibekali mesin V8 P60B40 berkapasitas 3.997cc dan mampu menyemburkan tenaga hingga 331,1 kW (444 HP) pada putaran 7.500 rpm.",
        "Merupakan mobil sport bermesin 3.0   L V6 mesin tengah berpenggerak roda belakang . Honda berkomitmen untuk proyek tersebut, dengan maksud untuk memenuhi atau melampaui kinerja jajaran Ferrari bermesin V8",
        "Mobil ini dibuat lantaran keinginan dari pemilik perusahaan Ford, Henry Ford Jr untuk mengalahkan Ferrari di sebuah ajang balapan bergengsi waktu itu, Le Mans 24.",
        "Varian sedan saloon Evo-IX dipersenjatai transmisi manual  berteknologi Twin Clutch SST gearbox yang berlanjut hingga ke generasi Evo-X."
    )

    val listData: ArrayList<Car>
        get() {
            val list = arrayListOf<Car>()
            for (position in carBrands.indices) {
                val car = Car()
                car.brand = carBrands[position]
                car.detail = carDetails[position]
                car.photo = carsImages[position]
                car.role = carsRoles[position]

                list.add(car)
            }
            return list
        }
}