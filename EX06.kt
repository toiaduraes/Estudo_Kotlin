fun main() {
	val precoProduto = 150.0
	val limiteDePreco = 200.0
    
	//Verificar se o preço do produto está dentro do orçamento
	if (precoProduto <= limiteDePreco) {
    	println("O preço do produto está dentro do orçamento.")
	} else{
    	println("O preço do produto é muito caro.")
	}
}
