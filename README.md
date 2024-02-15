# Valutaberegner
Kodeeksemplet indlæser valutakurser for danske kroner og euro med USD som basiskurs via denne URL `https://cdn.forexvalutaomregner.dk/api/latest.json`
<br><br>
Der kan hentes mere information om API'et her: `https://forexvalutaomregner.dk/pages/api`
<br>

### JSON data
Data kommer retur fra API som en JSON streng, der mappes til et Java objekt `CurrencyRates` vha. Gson som er et open source Java bibliotek fra Google.
Projektet skal kende Gson biblioteket, hvilket lettest gøres vha. Mavens pom.xml.
<br><br>
Indsæt i `pom.xml`:

```
 <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.10.1</version>
    </dependency>
```
Importér Gson i den klasse, som foretager mapning fra JSON data til Java objekt (i eksemplet er det i klassen `CurrencyService.java`).
`import com.google.gson.Gson;`
       
