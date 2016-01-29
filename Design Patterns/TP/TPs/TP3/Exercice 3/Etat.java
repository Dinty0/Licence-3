abstract class Etat
{
	protected Propriete _p;

	public Etat(Propriete p)
	{
		_p = p;
	}

	public void visitePar (Joueur j)
	{
		System.out.print(j.getNom() + " arrive sur " + nom_);
    	if (getProprio() == null) 
      	{
			System.out.print(" - pas encore vendu\n"+j.getNom());
			if (j.getArgent() < getPrix()) 
	 		{
	  			System.out.println(" ne peut pas acheter ce terrain.");
	  		} 
			else 
	  		{
		    	j.debit( getPrix());
		    	setProprio(j);
		    	System.out.println(" achete "+nom_ );
	  		}
      	} 
    	else 
      	{
			System.out.println(" - appartient a "+getProprio().getNom());
			if (j != getProprio()) 
	 		{
			    j.debit(getDroitsDePassage());
			    getProprio().credit(getDroitsDePassage());
			    System.out.println(getProprio().getNom()+" a maintenant "+getProprio().getArgent()+" euros.");
	  		}   
      	}
    	System.out.println(j.getNom()+" a "+j.getArgent()+" euros.");
  	}   

}