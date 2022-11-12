public class LampadaBool {
        private int estadoPorcentagem;
        //usei o anterior usando porcentagem, e fiz a verificação se ta ligada ou nao
        public int getEstadoPorcentagem(){
            return this.estadoPorcentagem;
        }
    
        public void setEstadoPorcentagem(int estadoPorcentagem){
            if(estadoPorcentagem>=0 || estadoPorcentagem<=100){
                this.estadoPorcentagem = estadoPorcentagem;
            }else{
                System.out.printf("erro\n");
                System.exit(-1);
            }
        }
    
        public bool estaLigada(){
            if(getEstadoPorcentagem()>0 && getEstadoPorcentagem()<=100){
                return true;
            }else if(getEstadoPorcentagem()==0){
                return false;
            }
        }
    }