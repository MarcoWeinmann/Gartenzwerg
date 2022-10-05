package de.syntaxinstitut.gartenzwerg.data.remote

import de.syntaxinstitut.gartenzwerg.R
import de.syntaxinstitut.gartenzwerg.data.models.Pflanzen

class Datasource {
    fun loadGemüuse(): List<Pflanzen> {
        return listOf(
//
//            Pflanzen(
//
//                "Basilikum",
//                R.drawable.basilikum1,
//                "Das Basilikum (Ocimum basilicum), auch Basilie, Basilienkraut oder Königskraut genannt, ist eine Gewürzpflanze aus der gleichnamigen Gattung Basilikum (Ocimum) in der Familie der Lippenblütler.",
//                1,
//                5,
//                5,
//                6,
//                11,
//                200
//            ),
//
//            Pflanzen(
//                "Blumenkohl",
//                R.drawable.blumenkohl,
//                "Blumenkohl (Bezeichnung in Deutschland und in Vorarlberg sowie Schweizer Hochdeutsch) bzw. Karfiol (österreichisches Hochdeutsch), " +
//                        "regional auch „Käsekohl“, „Blütenkohl“, „Traubenkohl“, „Minarett-Kohl“ oder „Italienischer Kohl“ genannt, ist eine Zuchtsorte des Gemüsekohls (Brassica oleracea) mit fleischigen, in einem Kopf zusammenstehenden Blütensprossen, die als Gemüse (genauer: als Blütengemüse) gegessen werden. Anders als bei anderen Kohlsorten bildet sich der Blütenstand bereits im ersten Jahr. Werden die Pflanzen nicht geerntet, kommt es zum „Schießen“, der gestauchte Spross streckt sich, und es werden gelbe Blüten und danach Samen gebildet.",
//                2,
//                4,
//                6,
//                7,
//                10,
//                3
//            ),
//
//            Pflanzen(
//                "Bohnen",
//                R.drawable.bohnen1,
//                "Als Bohne bezeichnet man sowohl die runden, teils länglichen oder nierenförmigen Samen als auch die sie umgebende Hülse mitsamt den eingeschlossenen Samen (zum Beispiel Grüne Bohnen, Prinzessbohnen, Ackerbohnen, auch von der Linsen-Wicke) und ebenfalls die gesamte solche Samen bildende Pflanze aus der Familie der Hülsenfrüchtler (Fabaceae oder auch Leguminosae). Es gibt zahlreiche Gattungen und Arten von Pflanzen mit unterschiedlicher Herkunft und unterschiedlichen Eigenschaften und Verwendungszwecken, die alle als Bohnen bezeichnet werden. Verschiedene Bohnen sind bedeutende Nutzpflanzen. Die wichtigsten Bohnen in Mitteleuropa sind die Samen der Gartenbohne (Phaseolus vulgaris).",
//                3,
//                5,
//                5,
//                7,
//                8,
//                25
//            ),
//
//            Pflanzen(
//                "Erbsen",
//                R.drawable.erbsen1,
//                "Die Pflanzengattung der Erbsen (Pisum) gehört zur Unterfamilie der Schmetterlingsblütler (Faboideae) innerhalb der Familie der Hülsenfrüchtler (Fabaceae). Von wirtschaftlicher Bedeutung ist die als Nahrungspflanze genutzte Gartenerbse (Pisum sativum). Viele Arten aus anderen Gattungen enthalten auch den Namensbestandteil -erbse, beispielsweise die Kichererbse.",
//                4,
//                3,
//                5,
//                6,
//                8,
//                25
//
//            ),
//
//            Pflanzen(
//                "Feldsalat",
//                R.drawable.feldsalat1,
//                "Die Arten von Feldsalat sind einjährig oder überwinternd-einjährig und sind dichotom verzweigt. Die Blüten sind zwittrig, am Ende der Zweige in Knäueln aber manchmal auch einzeln weiter unten am Stängel in den Achseln der Verzweigungen. Der Kelch kann fehlen oder er ist mit 6 bis 30 Zähnen verschieden groß entwickelt. Die Blütenkrone ist klein, mit fünf etwas ungleichen Zipfeln, sie ist bläulich oder rosa gefärbt.",
//                5,
//                7,
//                9,
//                9,
//                11,
//                1000
//            ),
//
//            Pflanzen(
//                "Gurke",
//                R.drawable.gurke,
//                "Die Gurke (Cucumis sativus), auch als Kukumer (lateinisch Cucumer) und Gartengurke bezeichnet, ist eine Art der Gattung Gurken (Cucumis) aus der Familie der Kürbisgewächse. Sie gehört zu den wirtschaftlich bedeutendsten Gemüsearten. Mit der unterschiedlichen Nutzung zusammenhängend, werden im Wesentlichen zwei Sortengruppen unterschieden: die Salatgurke (oder Schlangengurke) und die Einlege- oder Gewürzgurke. Der Verein zur Erhaltung der Nutzpflanzenvielfalt hat die Gurke zum Gemüse des Jahres für 2019 und 2020 ernannt.",
//                6,
//                4,
//                5,
//                7,
//                9,
//                2
//            ),
//
//            Pflanzen(
//                "Karotte",
//                R.drawable.karotte,
//                "Die Karotte (Daucus carota subsp. sativus), auch bezeichnet als Möhre, Mohrrübe, Gelbrübe, Gelbe Rübe, Rüebli, Riebli oder Wurzel, ist eine nur in Kultur bekannte Form der Möhre (Daucus carota) innerhalb der Familie der Doldenblütler (Apiaceae). Von dieser Gemüsepflanze wird fast ausschließlich die Pfahlwurzel genutzt.",
//                7,
//                3,
//                7,
//                5,
//                9,
//                40
//            ),
//
//            Pflanzen(
//                "Kartoffel",
//                R.drawable.kartoffel,
//                "Die Kartoffel (Solanum tuberosum), in Teilen Deutschlands, Österreichs und der Schweiz auch als Erdapfel, Erdbirne,[1] Grundbirne, Potaten (nur im Plural) und weiteren Regionalnamen bekannt, ist eine Nutzpflanze aus der Familie der Nachtschattengewächse (Solanaceae). Im allgemeinen Sprachgebrauch werden mit Kartoffeln meist die im Boden heranwachsenden Knollen bezeichnet, mit denen die Pflanze sich vegetativ vermehrt, und welche als einzige Pflanzenteile essbar sind.",
//                8,
//                3,
//                3,
//                8,
//                9,
//                20
//            ),
//
//            Pflanzen(
//                "Knoblauch",
//                R.drawable.knoblauch1,
//                "Knoblauch (Allium sativum) ist eine Pflanzenart aus der Gattung Lauch (Allium). Er ist heute fast weltweit verbreitet. Er wird als Gewürz- und Heilpflanze genutzt.",
//                9,
//                3,
//                4,
//                7,
//                8,
//                18
//            ),
//
//            Pflanzen(
//                "Kohlrabi",
//                R.drawable.kohlrabi1,
//                "Der Kohlrabi (Brassica oleracea var. gongylodes), auch Oberkohlrabi, Oberrübe, Kohlrübe (Wien), Rübkohl (Schweiz), Stängelrübe und Luftkohlrabi ist eine Gemüsepflanze. Er ist eine der vielen Zuchtformen des Gemüsekohls. Genutzt wird hier die verdickte, oberirdische Sprossachse (Sprossknolle).",
//                10,
//                2,
//                7,
//                5,
//                10,
//                3
//            ),
//
//            Pflanzen(
//                "Lauch",
//                R.drawable.lauch,
//                "Lauch (Allium ampeloprasum Lauch-Gruppe, Synonym: Allium porrum), auch Porree (von gleichbedeutend lateinisch porrum), Breitlauch, Winterlauch, Welschzwiebel, Gemeiner Lauch, Spanischer Lauch, Aschlauch, Fleischlauch genannt, ist eine Sortengruppe des aus dem Mittelmeerraum stammenden Ackerlauchs (Allium ampeloprasum). Dieses Gemüse zählt zur Gattung Allium in der Unterfamilie der Lauchgewächse.",
//                11,
//                4,
//                4,
//                8,
//                12,
//                60
//            ),
//
//            Pflanzen(
//                "Petersilie",
//                R.drawable.petersilie1,
//                "Die Petersilie (Petroselinum crispum; Synonym: Petroselinum sativum), in Österreich und Altbayern auch der Petersil, weitere Trivialnamen sind Peterle bzw. Peterli, Peterling, Petergrün und Silk (früher auch Felsensilge und Steineppich), ist eine Pflanzenart aus der Gattung Petroselinum innerhalb der Familie der Doldenblütler (Apiaceae). Sie kommt wildwachsend im Mittelmeerraum vor. In Europa und dem gesamten Mittelmeerraum gehören die je nach Sorte glatten oder krausen Blätter ihrer Zuchtformen zu den am meisten verbreiteten Küchenkräutern; die besonders große Speicherwurzel der Varietät oder Unterart Wurzelpetersilie (Petroselinum crispum subsp. tuberosum) dient als Bestandteil von Suppengrün.",
//                12,
//                2,
//                4,
//                5,
//                10,
//                6
//            ),
//
//            Pflanzen(
//                "Radieschen",
//                R.drawable.radieschen1,
//                "Die bis zu etwa vier Zentimeter dicke Speicherknolle schmeckt mitunter scharf, ist innen weiß und außen zumeist weinrot bis rot, kann abhängig von der Sorte jedoch auch andersfarbig sein. Der typische Geschmack des Radieschens wird durch ein Senföl verursacht, das bei Verletzung (durch Bearbeitung oder Anbeißen) aus den in der Pflanze enthaltenen Senfölglycosiden entsteht. In Europa hat sich das Radieschen im 16. Jahrhundert etabliert, seine Herkunft ist allerdings unklar. Es verbreitete sich zuerst langsam in der französischen Küche und dann weiter in ganz Europa.",
//                13,
//                3,
//                8,
//                4,
//                9,
//                60
//            ),
//
//            Pflanzen(
//                "Schnittlauch",
//                R.drawable.schnittlauch1,
//                "Schnittlauch (Allium schoenoprasum), auch Graslauch, Binsenlauch, Brislauch, Grusenich, Jakobszwiebel oder Schnittling genannt, ist eine Pflanzenart aus der Gattung Lauch (Allium). Schnittlauch wird als Gewürz verwendet und ist eine häufig vorkommende Kulturpflanze.",
//                14,
//                2,
//                9,
//                4,
//                10,
//                100
//            ),
//
//            Pflanzen(
//                "Spargel",
//                R.drawable.spargel1,
//                "Spargel (Asparagus), von lateinisch asparagus (Spargel: insbesondere Gemüsespargel, auch Spitzblättriger Spargel), ist eine Pflanzengattung in der Familie der Spargelgewächse (Asparagaceae). Asparagus-Arten sind in der Alten Welt in Eurasien und Afrika weitverbreitet. Es gibt einige Arten und Kulturformen, die als Zierpflanzen verwendet werden. Die wirtschaftlich wichtigste Art dieser Gattung ist der Gemüsespargel (Asparagus officinalis).",
//                15,
//                3,
//                4,
//                5,
//                6,
//                25
//            ),
//
//            Pflanzen(
//                "Tomate",
//                R.drawable.tomate1,
//                "Die Tomate (Solanum lycopersicum), in Österreich sowie in Südtirol auch der Paradeiser bzw. die Paradeis (seltener Paradeisapfel) genannt, ist eine Pflanzenart aus der Familie der Nachtschattengewächse (Solanaceae). Damit ist sie eng mit anderen Speisegewächsen wie der Kartoffel (Solanum tuberosum), der Paprika (Capsicum) und der Aubergine (Solanum melongena) verwandt, aber auch mit Pflanzen wie der Tollkirsche, der Alraune, der Engelstrompete, der Petunie oder dem Tabak (Nicotiana).",
//                16,
//                3,
//                3,
//                5,
//                8,
//                2
//
//            ),
//
//            Pflanzen(
//                "Zucchini",
//                R.drawable.zucchini1,
//                "Die Zucchini [tsuˈkiːni], in der Deutschschweiz Zucchetti, sind eine Unterart des Gartenkürbisses und gehören zur Pflanzenfamilie der Kürbisgewächse (Cucurbitaceae). Zucchini sind einhäusig, das heißt, männliche und weibliche Geschlechtsorgane befinden sich in getrennten Blüten, aber an einer Pflanze. Die Zucchini ist eine Zuchtform des ursprünglich in Amerika beheimateten und zu den ältesten Kulturpflanzen der Menschheit zählenden Gartenkürbis. Dieser gelangte in der Neuzeit nach Europa, wo in Italien die Zucchini gezüchtet wurde.",
//                17,
//                5,
//                5,
//                6,
//                8,
//                1
//            ),
//
//            Pflanzen(
//                "Zwiebel",
//                R.drawable.zwiebel,
//                "Die (in Österreich, Bayern und Schwaben auch der) Zwiebel (Allium cepa), auch Zwiebellauch, Bolle, Zipolle, Speisezwiebel, Küchenzwiebel, Gartenzwiebel, Sommerzwiebel, Hauszwiebel oder Gemeine Zwiebel genannt, ist eine Pflanzenart aus der Gattung Lauch (Allium).",
//                18,
//                3,
//                4,
//                7,
//                9,
//                25
//
//            ),
//
//            Pflanzen(
//                "Chilli",
//                R.drawable.chilli1,
//                "Die Pflanzengattung Paprika (Capsicum) gehört zur Familie der Nachtschattengewächse (Solanaceae). Die Früchte werden als Gemüse und Gewürz verwendet. Je nach Größe, Farbe und Geschmack sowie Schärfe werden für viele Sorten besondere Namen wie Chili, Spanischer Pfeffer, Peperoni, Peperoncini oder Pfefferoni gebraucht. Die am weitesten verbreitete Art, zu der auch die meisten in Europa erhältlichen Paprika, Peperoni und Chilis gehören, ist Capsicum annuum. Fast alle Paprika enthalten – in sehr unterschiedlicher Konzentration – den Stoff Capsaicin, der die Schärfe erzeugt.",
//                19,
//                7,
//                9,
//                8,
//                10,
//                3
//            ),
//
//            Pflanzen(
//                "Brokkoli",
//                R.drawable.brokkoli1,
//                "Brokkoli oder Broccoli (italienisch il broccolo von broccoli, „Kohlsprossen“), auch Bröckel-, Spargel- oder Winterblumenkohl genannt, ist eine mit dem Blumenkohl verwandte Gemüsepflanze aus der Familie der Kreuzblütengewächse.",
//                20,
//                2,
//                2,
//                7,
//                7,
//                4
//
//            )

        )
    }
}