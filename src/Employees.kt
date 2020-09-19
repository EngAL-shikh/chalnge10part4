class Employee private constructor(var builder: Builder) {
    var firstName: String = ""
    var lastName: String = ""
    var id: String = ""
    var managerId: String = ""
    var isManager: Boolean = false

    init {
        this.firstName = builder.firstName
        this.id = builder.id
        this.isManager = builder.isManager
        this.managerId = builder.managerId
        this.lastName = builder.lastName
    }

    class Builder {
        companion object
        var firstName: String = ""
        var lastName: String = ""
        var id: String = ""
        var managerId: String = ""
        var isManager: Boolean = false


        fun build(): Employee {
            return Employee(this)

        }

        fun setFirstName(firstName: String) = apply {  this.firstName = firstName }

        fun setId(Id: String) = apply { this.id = Id  }


        fun setIsManager(isManager: Boolean) = apply { this.isManager = isManager  }



        fun setManagerId(managerId: String) = apply { this.managerId = managerId  }


        fun setLstName(lastName: String) =apply { this.lastName = lastName }

    }

}

fun main() {
    var employee = Employee.Builder()
                                .setFirstName("hello")
                                .setLstName("word")
                                .setId("3155")
                                .setManagerId("1")
                                .setIsManager(false)
    println(employee.firstName+"  "+employee.lastName)

}