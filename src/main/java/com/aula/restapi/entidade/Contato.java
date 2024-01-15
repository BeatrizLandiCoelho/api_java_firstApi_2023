//_____________________________________________________________________________________________________________
// Pacote que contém a classe Contato
package com.aula.restapi.entidade;

// Importações de anotações do Jakarta Persistence(ele mapeia onjetos para trasformalos em tabela,
// isso faz com que eu nao presise escrever slq)
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//________________________________________________________________________________________________________________
// Definição da classe Contato como uma entidade persistente (será mapeada para uma tabela no banco de dados)
//um objeto persistente pode ser amarzenado e recuperado de maniera duradoura as alteracoes dele aqui sao relfetidas
//no banco de dados e vice versa
@Entity
public class Contato {
    
    // Identificador único para o contato, marcado como chave primária (ID)
    @Id
    // A estratégia de geração de valor para o ID é definida como IDENTITY (geração automática pelo banco de dados)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Coluna no banco de dados que armazena o nome do contato, não pode ser nula
    @Column(nullable = false)
    private String nome;

    // Coluna no banco de dados que armazena o telefone do contato, não pode ser nulo
    @Column(nullable = false)
    private String telefone;

    // Coluna no banco de dados que armazena o email do contato, não pode ser nulo
    @Column(nullable = false)
    private String email;

    // Coluna no banco de dados que armazena a URL do avatar do contato
    private String urlAvatar;

    // Métodos de acesso (getters e setters) para os atributos da classe

    // Método getter para obter o ID
    public Long getId() {
        return id;
    }

    // Método setter para definir o ID
    public void setId(Long id) {
        this.id = id;
    }

    // Método getter para obter o nome
    public String getNome() {
        return nome;
    }

    // Método setter para definir o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para obter o telefone
    public String getTelefone() {
        return telefone;
    }

    // Método setter para definir o telefone
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Método getter para obter o email
    public String getEmail() {
        return email;
    }

    // Método setter para definir o email
    public void setEmail(String email) {
        this.email = email;
    }

    // Método getter para obter a URL do avatar
    public String getUrlAvatar() {
        return urlAvatar;
    }

    // Método setter para definir a URL do avatar
    public void setUrlAvatar(String urlAvatar) {
        this.urlAvatar = urlAvatar;
    }
}
//___________________________________________________________________________________________________________
