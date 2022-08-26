package de.syntaxinstitut.gartenzwerg.data.models

import de.syntaxinstitut.gartenzwerg.R

class Datasource {
    fun loadGemüuse(): List<Pflanzen>{
        return listOf(

            Pflanzen(
                "Basilikum",
                R.drawable.Basilikum1,
                "Das Basilikum (Ocimum basilicum), auch Basilie, Basilienkraut oder Königskraut genannt, ist eine Gewürzpflanze aus der gleichnamigen Gattung Basilikum (Ocimum) in der Familie der Lippenblütler."
            ),

            Pflanzen(
                "Blumenkohl",
                R.drawable.Blumenkohl,
                "Blumenkohl (Bezeichnung in Deutschland und in Vorarlberg sowie Schweizer Hochdeutsch) bzw. Karfiol (österreichisches Hochdeutsch)[1] (Brassica oleracea var. botrytis L.), regional auch „Käsekohl“, „Blütenkohl“, „Traubenkohl“, „Minarett-Kohl“ oder „Italienischer Kohl“ genannt, ist eine Zuchtsorte des Gemüsekohls (Brassica oleracea) mit fleischigen, in einem Kopf zusammenstehenden Blütensprossen, die als Gemüse (genauer: als Blütengemüse) gegessen werden. Anders als bei anderen Kohlsorten bildet sich der Blütenstand bereits im ersten Jahr. Werden die Pflanzen nicht geerntet, kommt es zum „Schießen“, der gestauchte Spross streckt sich, und es werden gelbe Blüten und danach Samen gebildet."
            ),

            Pflanzen(
                "Bohnen",
                R.drawable.Bohnen1,
                "Als Bohne bezeichnet man sowohl die runden, teils länglichen oder nierenförmigen Samen als auch die sie umgebende Hülse mitsamt den eingeschlossenen Samen (zum Beispiel Grüne Bohnen, Prinzessbohnen, Ackerbohnen, auch von der Linsen-Wicke) und ebenfalls die gesamte solche Samen bildende Pflanze aus der Familie der Hülsenfrüchtler (Fabaceae oder auch Leguminosae). Es gibt zahlreiche Gattungen und Arten von Pflanzen mit unterschiedlicher Herkunft und unterschiedlichen Eigenschaften und Verwendungszwecken, die alle als Bohnen bezeichnet werden. Verschiedene Bohnen sind bedeutende Nutzpflanzen. Die wichtigsten Bohnen in Mitteleuropa sind die Samen der Gartenbohne (Phaseolus vulgaris)."
            ),

            Pflanzen(
                "Erbsen",
                R.drawable.Erbsen1,
                "Die Pflanzengattung der Erbsen (Pisum) gehört zur Unterfamilie der Schmetterlingsblütler (Faboideae) innerhalb der Familie der Hülsenfrüchtler (Fabaceae). Von wirtschaftlicher Bedeutung ist die als Nahrungspflanze genutzte Gartenerbse (Pisum sativum). Viele Arten aus anderen Gattungen enthalten auch den Namensbestandteil -erbse, beispielsweise die Kichererbse."
            ),

            Pflanzen(
                "Feldsalat",
                R.drawable.Feldsalat1,
                "Die Arten von Feldsalat sind einjährig oder überwinternd-einjährig und sind dichotom verzweigt. Die Blüten sind zwittrig, am Ende der Zweige in Knäueln aber manchmal auch einzeln weiter unten am Stängel in den Achseln der Verzweigungen. Der Kelch kann fehlen oder er ist mit 6 bis 30 Zähnen verschieden groß entwickelt. Die Blütenkrone ist klein, mit fünf etwas ungleichen Zipfeln, sie ist bläulich oder rosa gefärbt."
            ),

            Pflanzen(
                "Gurke",
                R.drawable.Gurke,
                "Die Gurke (Cucumis sativus), auch als Kukumer (lateinisch Cucumer) und Gartengurke bezeichnet, ist eine Art der Gattung Gurken (Cucumis) aus der Familie der Kürbisgewächse. Sie gehört zu den wirtschaftlich bedeutendsten Gemüsearten. Mit der unterschiedlichen Nutzung zusammenhängend, werden im Wesentlichen zwei Sortengruppen unterschieden: die Salatgurke (oder Schlangengurke) und die Einlege- oder Gewürzgurke. Der Verein zur Erhaltung der Nutzpflanzenvielfalt hat die Gurke zum Gemüse des Jahres für 2019 und 2020 ernannt."
            ),

            Pflanzen(
                "Karotte",
                R.drawable.Karotte,
                "Die Karotte (Daucus carota subsp. sativus), auch bezeichnet als Möhre, Mohrrübe, Gelbrübe, Gelbe Rübe, Rüebli, Riebli oder Wurzel, ist eine nur in Kultur bekannte Form der Möhre (Daucus carota) innerhalb der Familie der Doldenblütler (Apiaceae). Von dieser Gemüsepflanze wird fast ausschließlich die Pfahlwurzel genutzt."
            ),

            Pflanzen(
                "Kartoffel",
                R.drawable.Kartoffel,
                "Die Kartoffel (Solanum tuberosum), in Teilen Deutschlands, Österreichs und der Schweiz auch als Erdapfel, Erdbirne,[1] Grundbirne, Potaten (nur im Plural) und weiteren Regionalnamen bekannt, ist eine Nutzpflanze aus der Familie der Nachtschattengewächse (Solanaceae). Im allgemeinen Sprachgebrauch werden mit Kartoffeln meist die im Boden heranwachsenden Knollen bezeichnet, mit denen die Pflanze sich vegetativ vermehrt, und welche als einzige Pflanzenteile essbar sind."
            ),

            Pflanzen(
                "Knoblauch",
                R.drawable.Knoblauch1,
                "Knoblauch (Allium sativum) ist eine Pflanzenart aus der Gattung Lauch (Allium). Er ist heute fast weltweit verbreitet. Er wird als Gewürz- und Heilpflanze genutzt."
            ),

            Pflanzen(
                "Kohlrabi",
                R.drawable.Kohlrabi1,
                "Der Kohlrabi (Brassica oleracea var. gongylodes L.),[1] auch Oberkohlrabi, Oberrübe, Kohlrübe (Wien), Rübkohl (Schweiz), Stängelrübe[2] und Luftkohlrabi[3] ist eine Gemüsepflanze. Er ist eine der vielen Zuchtformen des Gemüsekohls. Genutzt wird hier die verdickte, oberirdische Sprossachse (Sprossknolle)."
            ),

            Pflanzen(
                "Lauch",
                R.drawable.Lauch,
                "Lauch (Allium ampeloprasum Lauch-Gruppe, Synonym: Allium porrum), auch Porree (von gleichbedeutend lateinisch porrum), Breitlauch, Winterlauch, Welschzwiebel, Gemeiner Lauch, Spanischer Lauch, Aschlauch, Fleischlauch genannt, ist eine Sortengruppe des aus dem Mittelmeerraum stammenden Ackerlauchs (Allium ampeloprasum).[1] Dieses Gemüse zählt zur Gattung Allium in der Unterfamilie der Lauchgewächse (Allioideae)."
            ),

            Pflanzen(
                "Petersilie",
                R.drawable.Petersilie1,
                "Die Petersilie (Petroselinum crispum; Synonym: Petroselinum sativum L.[1]), in Österreich und Altbayern auch der Petersil, weitere Trivialnamen sind Peterle bzw. Peterli, Peterling, Petergrün und Silk (früher auch Felsensilge und Steineppich[2]), ist eine Pflanzenart aus der Gattung Petroselinum innerhalb der Familie der Doldenblütler (Apiaceae). Sie kommt wildwachsend im Mittelmeerraum vor. In Europa und dem gesamten Mittelmeerraum gehören die je nach Sorte glatten oder krausen Blätter ihrer Zuchtformen zu den am meisten verbreiteten Küchenkräutern; die besonders große Speicherwurzel der Varietät oder Unterart Wurzelpetersilie (Petroselinum crispum subsp. tuberosum) dient als Bestandteil von Suppengrün."
            ),

            Pflanzen(
                "Radieschen",
                R.drawable.Radieschen1,
                "Die bis zu etwa vier Zentimeter dicke Speicherknolle schmeckt mitunter scharf, ist innen weiß und außen zumeist weinrot bis rot, kann abhängig von der Sorte jedoch auch andersfarbig sein. Der typische Geschmack des Radieschens wird durch ein Senföl verursacht, das bei Verletzung (durch Bearbeitung oder Anbeißen) aus den in der Pflanze enthaltenen Senfölglycosiden entsteht. In Europa hat sich das Radieschen im 16. Jahrhundert etabliert, seine Herkunft ist allerdings unklar. Es verbreitete sich zuerst langsam in der französischen Küche und dann weiter in ganz Europa."
            ),

            Pflanzen(
                "Schnittlauch",
                R.drawable.Schnittlauch1,
                "Schnittlauch (Allium schoenoprasum), auch Graslauch, Binsenlauch, Brislauch, Grusenich, Jakobszwiebel oder Schnittling genannt, ist eine Pflanzenart aus der Gattung Lauch (Allium). Schnittlauch wird als Gewürz verwendet und ist eine häufig vorkommende Kulturpflanze."
            ),

            Pflanzen(
                "Spargel",
                R.drawable.Spargel1,
                "Spargel (Asparagus), von lateinisch asparagus (Spargel: insbesondere Gemüsespargel, auch Spitzblättriger Spargel[1]), ist eine Pflanzengattung in der Familie der Spargelgewächse (Asparagaceae). Asparagus-Arten sind in der Alten Welt in Eurasien und Afrika weitverbreitet. Es gibt einige Arten und Kulturformen, die als Zierpflanzen verwendet werden.[2] Die wirtschaftlich wichtigste Art dieser Gattung ist der Gemüsespargel (Asparagus officinalis)."
            ),

            Pflanzen(
                "Tomate",
                R.drawable.Tomate1,
                "Die Tomate (Solanum lycopersicum), in Österreich sowie in Südtirol auch der Paradeiser bzw. die Paradeis[1] (seltener Paradeisapfel)[2] genannt, ist eine Pflanzenart aus der Familie der Nachtschattengewächse (Solanaceae). Damit ist sie eng mit anderen Speisegewächsen wie der Kartoffel (Solanum tuberosum), der Paprika (Capsicum) und der Aubergine (Solanum melongena) verwandt, aber auch mit Pflanzen wie der Tollkirsche, der Alraune, der Engelstrompete, der Petunie oder dem Tabak (Nicotiana)."
            ),

            Pflanzen(
                "Zucchini",
                R.drawable.Zucchini1,
                "Die Zucchini [tsuˈkiːni] (Cucurbita pepo subsp. pepo convar. giromontiina), in der Deutschschweiz Zucchetti, sind eine Unterart des Gartenkürbisses und gehören zur Pflanzenfamilie der Kürbisgewächse (Cucurbitaceae). Zucchini sind einhäusig, das heißt, männliche und weibliche Geschlechtsorgane befinden sich in getrennten Blüten, aber an einer Pflanze.\n" +
                        "Die Zucchini ist eine Zuchtform des ursprünglich in Amerika beheimateten und zu den ältesten Kulturpflanzen der Menschheit zählenden Gartenkürbis. Dieser gelangte in der Neuzeit nach Europa, wo in Italien die Zucchini gezüchtet wurde.[1] Erstmals beschrieben wurde eine Zucchini im Jahr 1856 vom französischen Botaniker Charles Victor Naudin."
            ),

            Pflanzen(
                "Zwiebel",
                R.drawable.Zwiebel1,
                "Die (in Österreich, Bayern und Schwaben auch der) Zwiebel (Allium cepa), auch Zwiebellauch, Bolle, Zipolle, Speisezwiebel, Küchenzwiebel, Gartenzwiebel, Sommerzwiebel, Hauszwiebel oder Gemeine Zwiebel genannt, ist eine Pflanzenart aus der Gattung Lauch (Allium)."

            )
        )
    }
}