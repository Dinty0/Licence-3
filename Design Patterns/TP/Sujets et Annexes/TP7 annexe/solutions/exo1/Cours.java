abstract class Cours
{
  protected String matiere;
  protected String salle;

  public String getMatiere() { return matiere; }
  public String getSalle() { return salle; }
}

class CoursInfo extends Cours
{
  public CoursInfo()
  {
    matiere = "info";
    salle = "salle info";
  }
}

class CoursMaths extends Cours
{
  public CoursMaths()
  {
    matiere = "maths";
    salle = "salle classique";
  }
}

class CoursChimie extends Cours
{
  public CoursChimie()
  {
    matiere = "chimie";
    salle = "salle chimie";
  }
}
