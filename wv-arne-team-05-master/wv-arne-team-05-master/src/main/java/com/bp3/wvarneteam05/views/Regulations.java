package com.bp3.wvarneteam05.views;

import com.bp3.wvarneteam05.Main;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;



public class Regulations {

    private Scene regulationsScene;

    public Regulations() {
        TopBar tb = new TopBar();
        Pane container = new Pane();
        ScrollPane scroll = new ScrollPane();
        Label lbRegulation = new Label("Reglementen");
        lbRegulation.relocate(825,150);

        Label lbRegulations = new Label("A. Definities\n" +
                "Artikel 1\n" +
                "Het havenreglement verstaat onder:\n" +
                "\n" +
                "a. WV Arne\n" +
                "\n" +
                "De watersportvereniging ‘Arne’ gevestigd te Middelburg, opgericht 28 oktober 1961.\n" +
                "\n" +
                "b. De jachthavens in beheer bij WV Arne, zijnde:\n" +
                "\n" +
                "1. de jachthaven te Middelburg\n" +
                "2. de jachthaven ‘Oostwatering’ te Veere\n" +
                "\n" +
                "c. Jachthaven\n" +
                "\n" +
                "1. In de gemeente Middelburg:\n" +
                "Het water van het Prins Hendrikdok, de Buitenhaven, de Fittinghaven, het Balkengat en de Binnenhaven " +
                "(in totaal een oppervlak van 38491 m2), en wat zich daarboven bevindt. Het water is in erfpacht\nvan de " +
                "gemeente Middelburg voor 30 jaar vanaf 31 december 2014).\n" +
                "\n" +
                "2. In de gemeente Veere: Een oppervlakte grond en water van 114.363 m2, kadastraal bekend gemeente Veere, " +
                "sectie N, nummers 1411 en 1484 (beiden gedeeltelijk), zijnde een gedeelte van de jachthaven\n‘Oostwatering’ " +
                "en het daarbij behorende trailerstrand, gelegen aan de Polredijk te Veere, eigendom van de Staat en door de " +
                "gemeente Veere aan de WV Arne in ondererfpacht uitgegeven gedurende\nde periode 1 april 1984 tot en met 31 " +
                "december 2040 en verder de volgende onroerende goederen:\n" +
                "– havenmeesterswoning met kantoor en werkplaats\n" +
                "– sanitairgebouwen, starttoren en andere clubgebouwen\n" +
                "– steigerwerken, box- en meerpalen, damwanden en beschoeiingen; parkeer- en kampeerterreinen en overige " +
                "verhardingen\n" +
                "– afrasteringen en beplanting\n" +
                "– nutsvoorzieningen behorende bij de opstallen, gas- en waterleidingen, elektrische en telefooninstallaties.\n" +
                "\n" +
                "d. Het bestuur\n" +
                "\n" +
                "Het bestuur van WV Arne\n" +
                "\n" +
                "e. De havencommissie\n" +
                "\n" +
                "Door het bestuur geïnstalleerde commissie.\n" +
                "\n" +
                "f. De havenmeester\n" +
                "\n" +
                "Door het bestuur benoemd persoon dan wel diens plaatsvervanger.\n" +
                "\n" +
                "g. Schipper\n" +
                "\n" +
                "De gezagvoerder van een vaartuig of degene die hem vervangt.\n" +
                "\n" +
                "h. Pleziervaartuigen\n" +
                "\n" +
                "Alle soorten en klassen vaartuigen die niet beroepsmatig worden gebruikt.\n" +
                "\n" +
                "i. Beroepsvaartuigen\n" +
                "\n" +
                "Alle soorten en klassen schepen die beroepsmatig worden gebruikt.\n" +
                "\n" +
                "j. Zomerseizoen\n" +
                "\n" +
                "De periode van 1 april tot en met 31 oktober.\n" +
                "\n" +
                "k. Winterseizoen\n" +
                "\n" +
                "De periode van 1 november tot en met 31 maart.\n" +
                "\n" +
                "l. Liggeld\n" +
                "\n" +
                "De gelden die conform het tarief voor een ligplaats zijn verschuldigd.\n" +
                "\n" +
                "n. Thuishaven\n" +
                "\n" +
                "De haven waar het vaartuig een vaste of semitijdelijke ligplaats heeft.\n" +
                "\n" +
                "o. Bezoeker\n" +
                "\n" +
                "Eenieder die zich op de jachthaven bevindt en die niet bij WV Arne in dienst is.\n" +
                "\n" +
                "p. Passant\n" +
                "\n" +
                "Een bemanningslid van een bezoekend vaartuig. Passanten zijn gehouden aan dit Havenreglement.\n" +
                "\n" +
                "q. Operationeel havenmanagement\n" +
                "\n" +
                "De daartoe benoemde havenmeester en de administratieve kracht gezamenlijk\n" +
                "\n" +
                "B. Algemene bepalingen\n" +
                "Artikel 2\n" +
                "De watersportvereniging Arne exploiteert de jachthavens.\n" +
                "\n" +
                "Artikel 3\n" +
                "De jachthavens zijn uitsluitend toegankelijk voor pleziervaartuigen, uitgezonderd jetski’s. Beroepsvaartuigen " +
                "verkrijgen alleen toegang tot de jachthavens na toestemming van de havenmeester.\n" +
                "\n" +
                "Artikel 4\n" +
                "\n" +
                "a. Iedere eigenaar of schipper is aansprakelijk voor de door hem of zijn vaartuig veroorzaakte schade aan " +
                "de jachthavens of aan eigendommen van derden. Als eigenaar geldt degene op wiens naam\nde verzekeringspolis" +
                " van het vaartuig is gesteld. Hij is verplicht over minimaal een WA- verzekering te beschikken om het bedoelde " +
                "risico te dekken. Hij dient de desbetreffende polis te kunnen tonen.\nIndien de eigenaar slechts WA-verzekerd " +
                "is, accepteert hij daarmee de kosten van schade aan eigen materiaal welke niet door andere eigenaren of " +
                "schippers gedekt is.\n" +
                "\n" +
                "b. De vereniging is niet aansprakelijk voor schade veroorzaakt door ongevallen, verlies en dergelijke, " +
                "hoe dan ook ontstaan.\n" +
                "\n" +
                "Artikel 5\n" +
                "Bij overtredingen van het havenreglement, welke niet op eerste sommatie ongedaan worden gemaakt of ophouden, " +
                "hebben het bestuur en/of de havenmeesters de bevoegdheid om de overtreder de\ntoegang tot de jachthavencomplexen " +
                "te ontzeggen. Als de overtreder een ligplaatstoewijzing geniet, wordt deze door het bestuur ingetrokken " +
                "gedurende een door het bestuur te bepalen termijn. \nDe ligplaats vervalt gedurende die termijn aan de vereniging.\n" +
                "\n" +
                "Artikel 6\n" +
                "Geschillen betreffende het havenbeheer kunnen binnen 10 dagen na ontstaan schriftelijk worden voorgelegd aan " +
                "het bestuur. Het bestuur behandelt het geschil in de eerstvolgende bestuursvergadering. \nWanneer een lid " +
                "dit verlangt, zal de beslissing van het bestuur op de eerstvolgende algemene ledenvergadering aan de orde worden gesteld.\n" +
                "\n" +
                "Artikel 7\n" +
                "\n" +
                "a. Onverminderd het bepaalde in artikel 141 van het wetboek van strafrecht zijn de havenmeesters en " +
                "havencommissarissen belast met het toezicht op de naleving van dit reglement.\n" +
                "\n" +
                "b. In alle gevallen waarin dit reglement niet voorziet, beslist het bestuur in overleg met de havencommissie.\n" +
                "\n" +
                "Artikel 8\n" +
                "Dit reglement is van kracht vanaf 12 mei 2017 en is voor eenieder in te zien op de havenkantoren en op de website.\n" +
                "\n" +
                "Artikel 9\n" +
                "Met het van kracht zijn van dit reglement vervallen alle vorige havenreglementen.\n" +
                "\n" +
                "C. Beheer jachthavens\n" +
                "Artikel 10\n" +
                "Havencommissie Het beheer van de jachthavens is door het bestuur opgedragen aan de havencommissie(s).\n" +
                "\n" +
                "Artikel 11\n" +
                "Voorzitter havencommissie(s)\n" +
                "Het bestuur benoemt de havencommissie en haar voorzitter, die de verantwoording draagt omtrent alle " +
                "aangelegenheden die betrekking hebben op de jachthavens. De voorzittersfunctie wordt vervuld \ndoor de " +
                "havencommissaris, die tevens lid van het verenigingsbestuur is. Indien er voor elke haven een commissie " +
                "kan worden ingesteld, geldt dit voor beide voorzitters.\n" +
                "\n" +
                "Artikel 12\n" +
                "Havenmeester\n" +
                "De dagelijkse leiding van de jachthavens berust bij de er dienstdoende havenmeester(s). Zij zijn " +
                "verantwoording verschuldigd aan de betreffende havencommissaris. De aansturing van personeel en \nwerkzaamheden " +
                "wordt verricht door het operationeel havenmanagement.\n" +
                "\n" +
                "Artikel 13\n" +
                "De havenmeesters zijn belast met:\n" +
                "\n" +
                "a. het ontvangen, uitgeleiden en behulpzaam zijn van passanten\n" +
                "\n" +
                "b. het aanwijzen van ligplaatsen aan passanten\n" +
                "\n" +
                "c. het registreren van passanten\n" +
                "\n" +
                "d. het innen van havengelden en andere vergoedingen van passanten of gebruikers\n" +
                "\n" +
                "e. het bevorderen van een goede sfeer op de haven\n" +
                "\n" +
                "f. het beheer en het gebruik van lig- en staanplaatsen in het water en op de wal, inclusief het uit het " +
                "water kranen en tewaterlaten van schepen\n" +
                "\n" +
                "g. het algemene toezicht op het gebruik van de haven\n" +
                "\n" +
                "h. het beheer van gebouwen, rollend materieel en andere goederen op de jachthavens\n" +
                "\n" +
                "i. het hijsen en strijken van de vlaggen;\n" +
                "\n" +
                "j. alle werkzaamheden, die voor een goed functioneren nuttig en nodig worden geacht.\n" +
                "\n" +
                "D. Bepalingen voor het gebruik van de jachthavens\n" +
                "Artikel 14\n" +
                "Eigenaren of schippers van een vaartuig zijn verplicht de aanwijzingen van de havenmeesters op te volgen.\n" +
                "\n" +
                "Artikel 15\n" +
                "De jachthavens zijn bestemd voor:\n" +
                "\n" +
                "a. zomerligplaatsen van pleziervaartuigen van leden en passanten\n" +
                "\n" +
                "b. winterlig- en -staplaatsen van pleziervaartuigen (zowel in het water als op de wal).\n" +
                "\n" +
                "Artikel 16\n" +
                "\n" +
                "a. Vaste ligplaatsen worden toegewezen door de havencommissie (= havenmeester en indelingscommissie) en " +
                "bekrachtigd door het bestuur, met inachtneming van de daarvoor gestelde regels. Toewijzing \ngeschiedt uitsluitend " +
                "aan hen die daartoe een schriftelijke aanvraag hebben ingediend. Jaarlijks dient deze aanvraag te worden herhaald.\n" +
                "\n" +
                "b. Ligplaatsen voor passanten worden aangewezen door de havenmeester voor de toegestane duur van het verblijf.\n" +
                "\n" +
                "c. Alle vaartuigen met een ligplaats in de haven dienen op een goed zichtbare plaats een duidelijke scheepsnaam " +
                "en thuishaven van het schip te voeren. Open boten kunnen eventueel ook volstaan \nmet een registratienummer.\n" +
                "\n" +
                "Artikel 17\n" +
                "Tijdelijk vrijkomende vaste ligplaatsen mogen worden benut ten behoeve van passanten. De houders van vaste " +
                "ligplaatsen zijn daarom verplicht het meerdaags niet benutten van hun ligplaats aan de \nhavenmeester door te geven.\n" +
                "\n" +
                "Artikel 18\n" +
                "Onderverhuur c.q. commercieel gebruik van het vaartuig of van de ligplaats is niet toegestaan.\n" +
                "\n" +
                "Artikel 19\n" +
                "De toegewezen vaste ligplaats wordt onmiddellijk ingetrokken:\n" +
                "\n" +
                "a. indien het liggeld niet is voldaan binnen een termijn van 14 dagen nadat de belanghebbende hiertoe door " +
                "het bestuur per aangetekende brief is gemaand\n" +
                "\n" +
                "b. indien het lidmaatschap door de vereniging of door het lid is opgezegd dan wel door royement van het lid.\n" +
                "\n" +
                "c. bij toepassing van de sanctie conform artikel 5 van dit havenreglement.\n" +
                "\n" +
                "Artikel 20\n" +
                "\n" +
                "a. Na intrekking of beëindiging van de ligplaatstoewijzing dient het (voormalig) lid of de passant de " +
                "ligplaats binnen de daarbij aangegeven termijn te verlaten.\n" +
                "\n" +
                "b. Indien de ligplaats niet tijdig en overeenkomstig het bepaalde in lid a. wordt opgeleverd, verbeurt " +
                "het (voormalig) lid of de passant, zonder dat enige sommatie, ingebrekestelling of rechterlijke \ntussenkomst " +
                "vereist zal zijn, aan de vereniging een boete van EUR 50 per dag dat hij verzuimt de ligplaats op te leveren, " +
                "onverminderd het recht van de vereniging op nakoming en/of schadevergoeding.\n" +
                "\n" +
                "c. Het bestuur heeft het recht de boot en andere zaken op kosten van het (voormalig) lid of de passant te " +
                "verwijderen, dan wel onder zich te houden (retentierecht). Alle kosten en risico’s die gepaard gaan \nmet " +
                "en/of voortvloeien uit deze verwijdering/opslag komen voor rekening en risico van het (voormalig) lid of " +
                "de passant. Dit laat onverlet de verplichting tot betaling van de bij b. genoemde boete, \nachterstallige " +
                "liggelden en dergelijke.\n" +
                "\n" +
                "Artikel 21\n" +
                "Arne-leden die een vaste ligplaats hebben, hebben in juli en augustus recht op in totaal 14 gratis " +
                "overnachtingen in de andere Arne-haven, mits zij aan boord overnachten en bij voldoende beschikbare \nplaatsen. " +
                "Dagtarief elektra en watertoeristenbelasting worden wel in rekening gebracht. Arne-leden die geen vaste " +
                "ligplaats hebben, hebben dit recht in een Arne-haven naar keuze.\n" +
                "\n" +
                "Artikel 22\n" +
                "\n" +
                "a. Passanten dienen zich onmiddellijk na aankomst te melden bij de havenmeester. Door het afmeren van " +
                "het vaartuig in de jachthaven onderwerpen zij zich aan de bepalingen van dit havenreglement. \nBetaling van " +
                "het verschuldigde liggeld, die op het kantoor van de havenmeester moet worden gedaan, geeft de opvarende " +
                "van de bezoekende vaartuigen het recht op de jachthaven te verblijven en \ngebruik te maken van de faciliteiten " +
                "met uitzondering van de kraan- en onderhoudsfaciliteiten te Oostwatering.\n" +
                "\n" +
                "b. Passanten kunnen een ligplaats krijgen voor een tijdvak van maximaal 30 aaneengesloten dagen. Een " +
                "volgend tijdvak kan pas weer ingaan na een onderbreking van minimaal 7 dagen. In bijzondere \nomstandigheden, " +
                "zulks ter beoordeling van de havencommissie, kan hiervan worden afgeweken.\n" +
                "\n" +
                "c. Passanten die in Middelburg aan de boodschappensteiger afmeren, mogen daar twee uur gratis liggen. " +
                "Bij overschrijding van deze tijdsduur wordt de helft van het overnachtingstarief in rekening \ngebracht.\n" +
                "\n" +
                "Artikel 23\n" +
                "Iedere eigenaar of schipper van een vaartuig is verplicht ervoor te zorgen, dat:\n" +
                "\n" +
                "a. het vaartuig deugdelijk ligt afgemeerd en wel zodanig, dat het vrij blijft van andere vaartuigen, " +
                "steigers en palen. Wordt aan het bovenstaande naar het oordeel van de havenmeester niet voldaan, \ndan " +
                "wordt hierin voorzien op kosten van de nalatige eigenaar of schipper;\n" +
                "\n" +
                "b. indien het voor het afmeren c.q. verlaten van de ligplaats noodzakelijk is landvasten van naastliggende " +
                "vaartuigen los te maken, dienen deze onmiddellijk weer deugdelijk bevestigd te worden;\n" +
                "\n" +
                "c. het vaartuig met de nodige stootwillen is uitgerust. Deze behoren in goede staat en van voldoende afmeting " +
                "te zijn en afdoende te zijn bevestigd langs de romp van het schip. Autobanden mogen niet \nworden toegepast.\n" +
                "\n" +
                "d. het vaartuig in een behoorlijke staat van onderhoud verkeert en naar het uiterlijk aan esthetische eisen voldoet;\n" +
                "\n" +
                "e. wintertenten of gelijksoortige voorzieningen gedurende het zomerseizoen verwijderd zijn;\n" +
                "\n" +
                "f. indien het vaartuig is voorzien van een motor, er een goed werkend blusapparaat aan boord is, geschikt " +
                "voor het snel en doeltreffend bestrijden van benzine- en oliebranden;\n" +
                "\n" +
                "g. auditieve alarminstallaties maximaal 30 seconden werken en visuele maximaal 5 minuten;\n" +
                "\n" +
                "h. indien dit op het trailerstrandje wordt gestald, het ordentelijk wordt geplaatst. Schade veroorzaakt " +
                "door het niet goed plaatsen, dan wel opbergen van het vaartuig komt voor rekening van de eigenaar \nof schipper " +
                "van het vaartuig.\n" +
                "\n" +
                "Artikel 24\n" +
                "Met toestemming van de havenmeester mag, met inachtneming van de artikelen 36a en 36b, een semipermanente1 " +
                "elektrische aansluiting aan het net van de jachthaven worden gemaakt, onder \nvoorwaarde, dat:\n" +
                "\n" +
                "a. een eurostekker wordt gebruikt en een 3-aderig snoer dat niet langer is dan 20 meter waarbij geen " +
                "koppelingen zijn toegestaan;\n" +
                "\n" +
                "1 van semipermanent is sprake indien de aansluiting intact blijft, terwijl men niet op het schip aanwezig is.\n" +
                "\n" +
                "b. aan boord van het vaartuig zich een correct gemonteerde en werkende aansluiting bevindt;\n" +
                "\n" +
                "c. een Kwh-meter is geplaatst in de aansluitkast, dan wel los is geleverd door de havenmeester;\n" +
                "\n" +
                "Artikel 25\n" +
                "Eigenaren of schippers van een vaartuig moeten te allen tijde het langszij afmeren gedogen, alsmede overgang " +
                "verlenen aan de bemanning van het desbetreffende vaartuig.\n" +
                "\n" +
                "Artikel 26\n" +
                "Het rollend materieel van WV Arne mag uitsluitend door de havenmeesters worden bediend. Het gebruik ten " +
                "behoeve van een vaartuig is geheel voor risico van de eigenaar van het vaartuig. Het staan op \nde wal van " +
                "een vaartuig dient te geschieden na overleg met en goedkeuring van de havenmeesters. Het staan op de wal " +
                "is in Middelburg niet toegestaan. Met uitzondering van calamiteiten wordt de kraan \nte Oostwatering uitsluitend " +
                "gebruikt tijdens de werkuren van de havenmeesters en op zondag alleen tussen 10:00 en 15:00. Uitgangspunt is, " +
                "dat de kraan uitsluitend wordt gebruikt ten behoeve van de \neigen leden.\n" +
                "\n" +
                "Artikel 27\n" +
                "Drinkwater tot maximaal 200 liter wordt gratis beschikbaar gesteld. Voor afname van grotere hoeveelheden " +
                "dient de havenmeester toestemming te geven. Het elektriciteitsgebruik van vaartuigen met een \nsemipermanente " +
                "aansluiting wordt aan het einde van het seizoen afgerekend. Voor zover er geen eigen aansluiting is en het " +
                "gebruik beperkt blijft, is dit gratis.\n" +
                "\n" +
                "Artikel 28\n" +
                "De gebruikers van ligplaatsen dienen eventuele schade aan de jachthaven of schepen onmiddellijk te melden " +
                "aan de havenmeester.\n" +
                "\n" +
                "Artikel 29\n" +
                "De schipper is verantwoordelijk voor het afmeren van het schip.\n" +
                "\n" +
                "Artikel 30\n" +
                "Geen ligplaats wordt verleend aan schepen, die door uiterlijk en/of staat van onderhoud bezwaren opleveren. " +
                "Dit ter beoordeling van de havenmeester.\n" +
                "\n" +
                "Artikel 31\n" +
                "Iedere bezoeker van de jachthaven die betrokken is bij of kennis draagt van een gebeurtenis waardoor " +
                "milieuschade is of dreigt te ontstaan, dient dit zo spoedig mogelijk te melden aan de havenmeester \nof " +
                "via de op het havenkantoor zichtbare telefoonnummers aan de verantwoordelijke veiligheidsorganen.\n" +
                "\n" +
                "Artikel 32\n" +
                "Elke schipper of eigenaar van een vaartuig dat ligplaats neemt in de jachthaven dient er zorg voor te " +
                "dragen, dat indien dat vaartuig is uitgerust met een gasinstallatie, deze functioneert en is geïnstalleerd " +
                "\nconform wettelijk voorschrift zoals beschreven in de NEN 3375.\n" +
                "\n" +
                "Artikel 33\n" +
                "Afval dient zoveel mogelijk gescheiden te worden aangeboden en in de daartoe bestemde containers te " +
                "worden gedeponeerd.\n" +
                "\n" +
                "E. Verbodsbepalingen onderhoud\n" +
                "Artikel 34\n" +
                "Het is verboden:\n" +
                "\n" +
                "a. op de jachthavens onderhoudswerken of reparaties te verrichten, die kunnen leiden tot verontreiniging " +
                "van het terrein, oppervlaktewater en/of bodem van de havens, zonder dat de nodige maatregelen \nter voorkoming " +
                "daarvan zijn getroffen. Eigenaren of schippers van een vaartuig zijn verplicht alle afvalstoffen die als " +
                "milieubelastend worden gekwalificeerd, zoals afgewerkte olie, bilgevloeistoffen, \nverfrestanten en inhoud " +
                "van chemische toiletten op aanwijzing van de havenmeester op een daartoe speciaal ingerichte havenontvangstinstallatie " +
                "af te geven of te storten.\n" +
                "\n" +
                "b. bij onderhoudswerken of reparaties hinderlijk geluid of andere overlast te veroorzaken (dit ter beoordeling " +
                "van de havenmeester of havencommissie), waaronder werkzaamheden die bij gasinstallaties \ntot ontploffingen of " +
                "branden kunnen leiden.\n" +
                "\n" +
                "c. schuurwerkzaamheden te verrichten, anders dan op door de havenmeester aangewezen plaatsen. Daar dient " +
                "een vloeistof– en stofdichte vloerafdekking te zijn aangebracht en stofafzuigend \nschuurgereedschap te " +
                "worden gebruikt.\n" +
                "\n" +
                "d. slijpwerkzaamheden te verrichten zonder volledige afscherming naar de directe omgeving.\n" +
                "\n" +
                "e. het onderwaterschip af te spuiten, anders dan op de daarvoor speciaal ingerichte afspuitplaats.\n" +
                "\n" +
                "f. het bovenwaterschip van een te water liggend vaartuig af te spuiten met een hogedrukreiniger.\n" +
                "\n" +
                "Artikel 35\n" +
                "Boetes voortvloeiend uit het niet voldoen aan wettelijke milieueisen zijn te allen tijde voor rekening " +
                "van het in gebreke blijvend lid. Aanvullend kan het bestuur het lid per direct het recht ontzeggen \nnog " +
                "verder gebruik te maken van de toegewezen lig- of staplaats.\n" +
                "\n" +
                "E. Overige verbodsbepalingen\n" +
                "Artikel 36\n" +
                "Het is verboden:\n" +
                "\n" +
                "a. een elektrische aansluiting aan één van de elektriciteitsnetten van WV Arne te maken waarmee een " +
                "groter vermogen dan 6A/h afgenomen wordt, tenzij op de kast een hoger ampèrage is aangegeven, \ndat in dat " +
                "geval als maximum geldt.\n" +
                "\n" +
                "b. een elektrische aansluiting tussen een vaartuig en de steiger c.q. de wal te hebben, wanneer de " +
                "eigenaar gebruiker zich niet aan boord van het betreffende vaartuig bevindt, tenzij krachtens artikel " +
                "23 \ntoestemming is verkregen.\n" +
                "\n" +
                "c. op een vaartuig of een steiger barbecues of andere brandgevaarlijke toestellen te gebruiken.\n" +
                "\n" +
                "d. hinderlijk lawaai te veroorzaken door het gebruik van geluidsapparatuur (zoals radio’s, tv’s, luidsprekers, " +
                "aggregaten enz.), door het tegen de mast laten slaan van lijnen, door motoren onnodig te laten \ndraaien enzovoort.\n" +
                "\n" +
                "e. zich te ontdoen van olie, vuilnis, afval, oliehoudend water, de inhoud van een chemisch toilet, " +
                "hondenuitwerpselen en verder alles wat de natuur verontreinigt, anders dan op de daartoe bestemde \nen/of " +
                "aangegeven plaats.\n" +
                "\n" +
                "f. gebouwen op enigerlei wijze te verontreinigen;\n" +
                "\n" +
                "g. onderwatertoiletten in de jachthaven te gebruiken of fecaliëntanks te legen anders dan in de daarvoor " +
                "bestemde installaties.\n" +
                "\n" +
                "h. huisdieren los te laten lopen op de jachthavens.\n" +
                "\n" +
                "i. aan overige gebruikers van de jachthaven aanstoot te geven door wangedrag en/of het verstoren van rust en orde.\n" +
                "\n" +
                "j. te spelevaren tussen en in de nabijheid van steigerwerken. Varen in de haven is slechts toegestaan om " +
                "vanaf de ligplaats openbaar vaarwater te bereiken.\n" +
                "\n" +
                "k. zodanig schroefwater te veroorzaken, dat gevaar voor beschadiging van de oevers of vaartuigen bestaat.\n" +
                "\n" +
                "l. constructies of wijzigingen aan te brengen aan steigers of installaties.\n" +
                "\n" +
                "m. steigers geheel of gedeeltelijk te blokkeren.\n" +
                "\n" +
                "n. goederen, in welke vorm dan ook, op steigers en/of het terrein te laten liggen;\n" +
                "\n" +
                "o. kinderen zonder begeleiding die niet kunnen zwemmen zonder deugdelijk zwemvest op de steigers te laten\n" +
                "\n" +
                "p. in de jachthaven:\n" +
                "– te zwemmen\n" +
                "– te vissen\n" +
                "– te surfen\n" +
                "– op de taluds of in de heesterbeplanting te lopen\n" +
                "– te zeilen met boten die voorzien zijn van een motor\n" +
                "– harder dan 5 km per uur te varen\n" +
                "– te ankeren\n" +
                "\n" +
                "q. zich in jachthaven Oostwatering te bevinden op de afspuit- en kraanplaats, anders dan bij het tewaterlaten " +
                "of uit het water laten halen van het vaartuig.\n" +
                "\n" +
                "r. in Oostwatering van het parkeerterrein gebruik te maken, anders dan voor normaal bezoek aan de haven.\n" +
                "\n" +
                "s. motorvoertuigen te parkeren bij kampeereenheden (tenten en caravans).\n" +
                "\n" +
                "t. vaartuigen commercieel te koop of te huur aan te bieden.\n" +
                "\n" +
                "u. voor jachtherstellers, kooplieden en handelaren op de jachthavens handel te drijven of reclame aan te " +
                "brengen, of te voeren, in welke vorm dan ook.\n" +
                "\n" +
                "v. voor onbevoegden zich op de jachthavens te bevinden. De havenmeesters zijn bevoegd, met inachtneming " +
                "van het bepaalde in artikel 22, om personen de toegang te weigeren, indien hun aanwezigheid \ndaar niet " +
                "gewenst c.q. noodzakelijk is.\n" +
                "\n" +
                "w. schepen langer dan één jaar op de wal te laten staan, met uitzondering van het strandje.\n" +
                "\n" +
                "Aldus vastgesteld ter algemene ledenvergadering van 12 mei 2017");
        lbRegulations.setStyle("-fx-font-size: 20px");

        Button btnReturn = new Button("Terug");
        btnReturn.relocate(15,139);
        btnReturn.setOnAction(e-> {
            Main.setScene(new Home().getHomeScene());
        });

        container.getChildren().addAll(tb.getTopBar(), lbRegulation, btnReturn, scroll);
        scroll.setPrefSize(1830,800);
        scroll.relocate(50,250);
        scroll.setStyle("-fx-border-style: solid; -fx-border-width: 1; -fx-border-color: #707070; -fx-background-color: #F5F5F5;");
        scroll.setContent(lbRegulations);

        regulationsScene = new Scene(container, Main.width, Main.height);
        //regulationsScene = new Scene(scroll, Main.width, Main.height);
        regulationsScene.getStylesheets().add(getClass().getResource("/com/bp3/wvarneteam05/stylesheet.css").
                        toExternalForm());
        lbRegulation.getStyleClass().add("label-input");
        btnReturn.getStyleClass().add("button-back");
        container.getStyleClass().add("pane-primary");
    }

    public Scene getRegulationsScene() { return regulationsScene; }

}
