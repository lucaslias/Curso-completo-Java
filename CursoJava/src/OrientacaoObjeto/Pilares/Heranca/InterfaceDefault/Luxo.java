package OrientacaoObjeto.Pilares.Heranca.InterfaceDefault;

public interface Luxo {

	void ligarAr();
	void desligarAr();
	
	//n�o ir� obrigar a Classe implementar, mas ele pode
	default int nivelDoAr() {
		return 1;
	}
	
}
