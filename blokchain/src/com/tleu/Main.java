package com.tleu;

public class Main {

    public static void main(String[] args) {

        BlockChain blockChain = new BlockChain();
        Miner miner = new Miner();

        Block block0 = new Block(0,Constants.GENESIS_PREV_HASH
                ,"System pay 1 Unicoin to Assel");
        miner.mine(block0,blockChain);


        Block block1 = new Block(1,blockChain.getBlockChain().get(blockChain.size()-1).getHash()
                ,"Assel pay 1 UniCoin to Andrew");
        miner.mine(block1,blockChain);

        Block block2 = new Block(2,blockChain.getBlockChain().get(blockChain.size()-1).getHash(),
        "Andrew pay 1 UniCoin to Sanzhar");
        miner.mine(block2,blockChain);

        System.out.println("\n"
                + "UniCoin BlockChain: \n"+blockChain);

        System.out.println("Miner' reward: " + miner.getReward());
    }
}
