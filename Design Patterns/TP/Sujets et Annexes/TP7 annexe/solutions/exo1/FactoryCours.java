abstract class FactoryCours
{
  public abstract Cours creerCours();
}

/*
 * J'ai décidé ici de faire la factory d'une manière un peu différente
 * qu'en cours/TD : il n'y a pas de tests conditionnels pour savoir 
 * quel cours on souhaite. 1 factory concrète = 1 type de cours.
 */

class FactoryCoursInfo extends FactoryCours
{
  public Cours creerCours() { return new CoursInfo(); }
}

class FactoryCoursMaths extends FactoryCours
{
  public Cours creerCours() { return new CoursMaths(); }
}

class FactoryCoursChimie extends FactoryCours
{
  public Cours creerCours() { return new CoursChimie(); }
}
