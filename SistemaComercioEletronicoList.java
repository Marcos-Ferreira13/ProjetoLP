package Projeto;

import java.util.ArrayList;
import java.util.List;

public class SistemaComercioEletronicoList {
	List<Cliente> clientes;
	List<Pedido> pedidos;
	List<Produto> produtos;
	
	
	public SistemaComercioEletronicoList() {
		this.clientes = new ArrayList<>();
		this.pedidos = new ArrayList<>();
		this.produtos = new ArrayList<>();
		
	}
	
	
	public boolean existeProduto(Produto p ) {
		for(Produto c : produtos) {
			if(c.getCodigo().equals(p)) {
				return true;
			}
			
		}
		
		return false;
	}
	
	public List<Produto> pesquisaProduto(String codigoProduto){
		List<Produto> produtoAchado = new ArrayList();
		for(Produto p : produtos) {
			if(p.getCodigo().equals(codigoProduto)) {
				produtoAchado.add(p);
			}
		}
		return produtoAchado;
	}
	
	public boolean cadastraProduto(Produto produto) {
		for(Produto p : produtos ) {
			
			if(!p.equals(produto) ) {
				this.produtos.add(produto);
				return true;
			}
		}
		return false;
	}
	
	public boolean cadastraPedido(Pedido pedido) {
		for(Pedido p : pedidos ) {
			
			if(!p.equals(pedido) ) {
				this.pedidos.add(pedido);
				return true;
			}
		}
		return false;
	}
	
	
	public boolean existePedido(Pedido pedido) {
		for(Pedido pe : pedidos) {
			if(pe.equals(pedido)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean cadastraCliente(Cliente cliente) {
		for(Cliente c : clientes) {
			
			if(!c.equals(cliente) ) {
				this.clientes.add(cliente);
				return true;
			}
		}
		return false;
	}
	
	public boolean existeCliente(Cliente cliente) {
		for(Cliente c : clientes) {
			if(c.getNome().equals(cliente)){
				return true;
			}
		}
		return false;
	}
	
	
	public List<Cliente> pesquisaClienteComOPrefixo(String prefixo){
		List<Cliente> retornaPrefixo = new ArrayList();
		for(Cliente c : clientes) {
			if(c.getNome().startsWith(prefixo)) {
				retornaPrefixo.add(c);
			}
		}
		return retornaPrefixo;
	}
	
	
//	public List<Pedido> pesquisaPedidosIncluindoProduto(String codigoProduto){
//		for(Pedido pe : pedidos) {
//			if(pe.getC)
//		}
		
	
	
	}
	

