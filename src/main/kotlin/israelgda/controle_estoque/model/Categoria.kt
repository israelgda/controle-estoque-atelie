package israelgda.controle_estoque.model

import jakarta.persistence.*
import org.springframework.data.annotation.Id

@Entity
@Table(name = "categoria")
class Categoria(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    var nome: String,
    var descricao: String,

    @ManyToMany(mappedBy = "categorias")
    var materiais: Set<Material>
) {

    constructor(): this(
        0L,
        "",
        "",
        setOf()
    )
}