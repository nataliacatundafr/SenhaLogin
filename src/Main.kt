fun main(){
    println("Login")
    println("Digite senha")
    val  senha: String = readln() //entra com senha
    val regex = Regex("[!@#%]"+ "[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z]") //filtra a string por esses caracteres
    if (regex.containsMatchIn(senha)) {
        println("Senha contém caractere especial")
    } // associa a variável imutavel á o regex perguntando se esses caracteres estão no input digitado.
        when  (senha==""){
                    else-> {
                        println("Digite senha")
                        println("Senha incorreta, digite ao menos um maiuscula e um caráctere especial")
                    } // caso não... senha incorreta.


        }

    }

