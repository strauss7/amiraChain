package amiraChain;

import java.util.ArrayList;

import com.google.gson.GsonBuilder;

public class amiraChain {
	
	public static ArrayList<Block> blockchain = new ArrayList<Block>();

	public static void main(String[] args) {
		
		blockchain.add(new Block("Hi im the first block", "0"));
		blockchain.add(new Block("Hi im the second block", blockchain.get(blockchain.size()-1).hash));
		blockchain.add(new Block("Hi im the third block", blockchain.get(blockchain.size()-1).hash));
		
		String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
		System.out.println(blockchainJson);
	}

}
