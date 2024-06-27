package com.mycompany.trabalhosub.models;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_filmes")
public class Filme {
    
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "Title")
    private String Title;
    @Column(name = "Year")
    private String Year;
    @Column(name = "Rated")
    private String Rated;
    @Column(name = "Released")
    private String Released;
    @Column(name = "Runtime")
    private String Runtime;
    @Column(name = "Genre")
    private String Genre;
    @Column(name = "Director")
    private String Director;
    @Column(name = "Writer")
    private String Writer;
    @Column(name = "Actors")
    private String Actors;
    @Column(name = "Plot")
    private String Plot;
    @Column(name = "Language")
    private String Language;
    @Column(name = "Country")
    private String Country;
    @Column(name = "Awards")
    private String Awards;
    @Column(name = "Poster")
    private String Poster;
    @Column(name = "Ratings")
    private List<Rating> Ratings;
    @Column(name = "Metascore")
    private String Metascore;
    @Column(name = "imdbRating")
    private String imdbRating;
    @Column(name = "imdbVotes")
    private String imdbVotes;
    @Column(name = "imdbID")
    private String imdbID;
    @Column(name = "Type")
    private String Type;
    @Column(name = "DVD")
    private String DVD;
    @Column(name = "BoxOffice")
    private String BoxOffice;
    @Column(name = "Production")
    private String Production;
    @Column(name = "Website")
    private String Website;
    @Column(name = "Response")
    private String Response;

    @Override
    public String toString() {
        return "Filme{" + "Title=" + Title + ", Year=" + Year + ", Rated=" + Rated + ", Released=" + Released + ", Runtime=" + Runtime + ", Genre=" + Genre + ", Director=" + Director + ", Writer=" + Writer + ", Actors=" + Actors + ", Plot=" + Plot + ", Language=" + Language + ", Country=" + Country + ", Awards=" + Awards + ", Poster=" + Poster + ", Ratings=" + Ratings + ", Metascore=" + Metascore + ", imdbRating=" + imdbRating + ", imdbVotes=" + imdbVotes + ", imdbID=" + imdbID + ", Type=" + Type + ", DVD=" + DVD + ", BoxOffice=" + BoxOffice + ", Production=" + Production + ", Website=" + Website + ", Response=" + Response + '}';
    }

    public Filme() {
    }

    public Filme(String Title, String Year, String Rated, String Released, String Runtime, String Genre, String Director, String Writer, String Actors, String Plot, String Language, String Country, String Awards, String Poster, List<Rating> Ratings, String Metascore, String imdbRating, String imdbVotes, String imdbID, String Type, String DVD, String BoxOffice, String Production, String Website, String Response) {
        this.Title = Title;
        this.Year = Year;
        this.Rated = Rated;
        this.Released = Released;
        this.Runtime = Runtime;
        this.Genre = Genre;
        this.Director = Director;
        this.Writer = Writer;
        this.Actors = Actors;
        this.Plot = Plot;
        this.Language = Language;
        this.Country = Country;
        this.Awards = Awards;
        this.Poster = Poster;
        this.Ratings = Ratings;
        this.Metascore = Metascore;
        this.imdbRating = imdbRating;
        this.imdbVotes = imdbVotes;
        this.imdbID = imdbID;
        this.Type = Type;
        this.DVD = DVD;
        this.BoxOffice = BoxOffice;
        this.Production = Production;
        this.Website = Website;
        this.Response = Response;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public String getRated() {
        return Rated;
    }

    public void setRated(String Rated) {
        this.Rated = Rated;
    }

    public String getReleased() {
        return Released;
    }

    public void setReleased(String Released) {
        this.Released = Released;
    }

    public String getRuntime() {
        return Runtime;
    }

    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public String getWriter() {
        return Writer;
    }

    public void setWriter(String Writer) {
        this.Writer = Writer;
    }

    public String getActors() {
        return Actors;
    }

    public void setActors(String Actors) {
        this.Actors = Actors;
    }

    public String getPlot() {
        return Plot;
    }

    public void setPlot(String Plot) {
        this.Plot = Plot;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getAwards() {
        return Awards;
    }

    public void setAwards(String Awards) {
        this.Awards = Awards;
    }

    public String getPoster() {
        return Poster;
    }

    public void setPoster(String Poster) {
        this.Poster = Poster;
    }

    public List<Rating> getRatings() {
        return Ratings;
    }

    public void setRatings(List<Rating> Ratings) {
        this.Ratings = Ratings;
    }

    public String getMetascore() {
        return Metascore;
    }

    public void setMetascore(String Metascore) {
        this.Metascore = Metascore;
    }

    public String getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }

    public String getImdbVotes() {
        return imdbVotes;
    }

    public void setImdbVotes(String imdbVotes) {
        this.imdbVotes = imdbVotes;
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getDVD() {
        return DVD;
    }

    public void setDVD(String DVD) {
        this.DVD = DVD;
    }

    public String getBoxOffice() {
        return BoxOffice;
    }

    public void setBoxOffice(String BoxOffice) {
        this.BoxOffice = BoxOffice;
    }

    public String getProduction() {
        return Production;
    }

    public void setProduction(String Production) {
        this.Production = Production;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String Website) {
        this.Website = Website;
    }

    public String getResponse() {
        return Response;
    }

    public void setResponse(String Response) {
        this.Response = Response;
    }

   
}

class Rating {
    private String Source;
    private String Value;

    public Rating() {
    }

    public Rating(String Source, String Value) {
        this.Source = Source;
        this.Value = Value;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String Source) {
        this.Source = Source;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String Value) {
        this.Value = Value;
    }

    @Override
    public String toString() {
        return "Rating{" + "Source=" + Source + ", Value=" + Value + '}';
    }

   
}

