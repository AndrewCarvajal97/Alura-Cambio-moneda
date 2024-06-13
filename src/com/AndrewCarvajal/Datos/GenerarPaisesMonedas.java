package com.AndrewCarvajal.Datos;

import com.AndrewCarvajal.ConversorMoneda.Modelos.Moneda;
import com.AndrewCarvajal.ConversorMoneda.Modelos.Pais;

import java.util.ArrayList;
import java.util.List;

public class GenerarPaisesMonedas {



    public void generarMonedas(List<Moneda> monedasAceptadas,List<Pais>PaisesRegistrados){
        String[][] data={
                {"AED","Dirham de los Emiratos Árabes Unidos", "Emiratos Árabes Unidos"},
                {"AFN","Afgani afgano", "Afganistán"},
                {"ALL","Lek albanés", "Albania"},
                {"AMD","Dram armenio", "Armenia"},
                {"ANG","Florín antillano neerlandés", "Antillas Neerlandesas"},
                {"AOA", "Kwanza angoleño", "Angola"},
                {"ARS", "Peso argentino", "Argentina"},
                {"AUD", "Dólar australiano", "Australia"},
                {"AWG", "Florín arubeño", "Aruba"},
                {"AZN", "Manat azerbaiyano", "Azerbaiyán"},
                {"BAM", "Marco bosnioherzegovino", "Bosnia y Herzegovina"},
                {"BBD", "Dólar de Barbados", "Barbados"},
                {"BDT", "Taka bangladesí", "Bangladesh"},
                {"BGN", "Lev búlgaro", "Bulgaria"},
                {"BHD", "Dinar bahreiní", "Bahréin"},
                {"BIF", "Franco burundés", "Burundi"},
                {"BMD", "Dólar bermudeño", "Bermudas"},
                {"BND", "Dólar bruneano", "Brunéi"},
                {"BOB", "Boliviano boliviano", "Bolivia"},
                {"BRL", "Real brasileño", "Brasil"},
                {"BSD", "Dólar bahameño", "Bahamas"},
                {"BTN", "Ngultrum butanés", "Bután"},
                {"BWP", "Pula botsuano", "Botsuana"},
                {"BYN", "Rublo bielorruso", "Bielorrusia"},
                {"BZD", "Dólar beliceño", "Belice"},
                {"CAD", "Dólar canadiense", "Canadá"},
                {"CDF", "Franco congoleño", "República Democrática del Congo"},
                {"CHF", "Franco suizo", "Suiza"},
                {"CLP", "Peso chileno", "Chile"},
                {"CNY", "Renminbi chino", "China"},
                {"COP", "Peso colombiano", "Colombia"},
                {"CRC", "Colón costarricense", "Costa Rica"},
                {"CUP", "Peso cubano", "Cuba"},
                {"CVE", "Escudo caboverdiano", "Cabo Verde"},
                {"CZK", "Corona checa", "República Checa"},
                {"DJF", "Franco yibutiano", "Yibuti"},
                {"DKK", "Corona danesa", "Dinamarca"},
                {"DOP", "Peso dominicano", "República Dominicana"},
                {"DZD", "Dinar argelino", "Argelia"},
                {"EGP", "Libra egipcia", "Egipto"},
                {"ERN", "Nakfa eritreo", "Eritrea"},
                {"ETB", "Birr etíope", "Etiopía"},
                {"EUR", "Euro", "Unión Europea"},
                {"FJD", "Dólar fiyiano", "Fiyi"},
                {"FKP", "Libra malvinense", "Islas Malvinas"},
                {"FOK", "Corona feroesa", "Islas Feroe"},
                {"GBP", "Libra esterlina", "Reino Unido"},
                {"GEL", "Lari georgiano", "Georgia"},
                {"GGP", "Libra de Guernsey", "Guernsey"},
                {"GHS", "Cedi ghanés", "Ghana"},
                {"GIP", "Libra gibraltareña", "Gibraltar"},
                {"GMD", "Dalasi gambiano", "Gambia"},
                {"GNF", "Franco guineano", "Guinea"},
                {"GTQ", "Quetzal guatemalteco", "Guatemala"},
                {"GYD", "Dólar guyanés", "Guyana"},
                {"HKD", "Dólar de Hong Kong", "Hong Kong"},
                {"HNL", "Lempira hondureño", "Honduras"},
                {"HRK", "Kuna croata", "Croacia"},
                {"HTG", "Gourde haitiano", "Haití"},
                {"HUF", "Forinto húngaro", "Hungría"},
                {"IDR", "Rupia indonesia", "Indonesia"},
                {"ILS", "Nuevo shéquel israelí", "Israel"},
                {"IMP", "Libra manesa", "Isla de Man"},
                {"INR", "Rupia india", "India"},
                {"IQD", "Dinar iraquí", "Iraq"},
                {"IRR", "Rial iraní", "Irán"},
                {"ISK", "Corona islandesa", "Islandia"},
                {"JEP", "Libra de Jersey", "Jersey"},
                {"JMD", "Dólar jamaicano", "Jamaica"},
                {"JOD", "Dinar jordano", "Jordania"},
                {"JPY", "Yen japonés", "Japón"},
                {"KES", "Chelín keniano", "Kenia"},
                {"KGS", "Som kirguís", "Kirguistán"},
                {"KHR", "Riel camboyano", "Camboya"},
                {"KID", "Dólar de Kiribati", "Kiribati"},
                {"KMF", "Franco comorano", "Comoras"},
                {"KRW", "Won surcoreano", "Corea del Sur"},
                {"KWD", "Dinar kuwaití", "Kuwait"},
                {"KYD", "Dólar de las Islas Caimán", "Islas Caimán"},
                {"KZT", "Tenge kazajo", "Kazajistán"},
                {"LAK", "Kip laosiano", "Laos"},
                {"LBP", "Libra libanesa", "Líbano"},
                {"LKR", "Rupia de Sri Lanka", "Sri Lanka"},
                {"LRD", "Dólar liberiano", "Liberia"},
                {"LSL", "Loti lesothense", "Lesoto"},
                {"LYD", "Dinar libio", "Libia"},
                {"MAD", "Dírham marroquí", "Marruecos"},
                {"MDL", "Leu moldavo", "Moldavia"},
                {"MGA", "Ariary malgache", "Madagascar"},
                {"MKD", "Denar macedonio", "Macedonia del Norte"},
                {"MMK", "Kyat birmano", "Myanmar"},
                {"MNT", "Tugrik mongol", "Mongolia"},
                {"MOP", "Pataca de Macao", "Macao"},
                {"MRU", "Uguiya mauritana", "Mauritania"},
                {"MUR", "Rupia mauriciana", "Mauricio"},
                {"MVR", "Rufiyaa de Maldivas", "Maldivas"},
                {"MWK", "Kwacha malauí", "Malawi"},
                {"MXN", "Peso mexicano", "México"},
                {"MYR", "Ringgit malasio", "Malasia"},
                {"MZN", "Metical mozambiqueño", "Mozambique"},
                {"NAD", "Dólar namibio", "Namibia"},
                {"NGN", "Naira nigeriano", "Nigeria"},
                {"NIO", "Córdoba nicaragüense", "Nicaragua"},
                {"NOK", "Corona noruega", "Noruega"},
                {"NPR", "Rupia nepalesa", "Nepal"},
                {"NZD", "Dólar neozelandés", "Nueva Zelanda"},
                {"OMR", "Rial omaní", "Omán"},
                {"PAB", "Balboa panameño", "Panamá"},
                {"PEN", "Sol peruano", "Perú"},
                {"PGK", "Kina de Papúa Nueva Guinea", "Papúa Nueva Guinea"},
                {"PHP", "Peso filipino", "Filipinas"},
                {"PKR", "Rupia pakistaní", "Pakistán"},
                {"PLN", "Zloty polaco", "Polonia"},
                {"PYG", "Guaraní paraguayo", "Paraguay"},
                {"QAR", "Riyal catarí", "Catar"},
                {"RON", "Leu rumano", "Rumania"},
                {"RSD", "Dinar serbio", "Serbia"},
                {"RUB", "Rublo ruso", "Rusia"},
                {"RWF", "Franco ruandés", "Ruanda"},
                {"SAR", "Riyal saudí", "Arabia Saudita"},
                {"SBD", "Dólar de las Islas Salomón", "Islas Salomón"},
                {"SCR", "Rupia seychellense", "Seychelles"},
                {"SDG", "Libra sudanesa", "Sudán"},
                {"SEK", "Corona sueca", "Suecia"},
                {"SGD", "Dólar de Singapur", "Singapur"},
                {"SHP", "Libra de Santa Elena", "Santa Elena"},
                {"SLE", "Leone sierraleonés", "Sierra Leona"},
                {"SOS", "Chelín somalí", "Somalia"},
                {"SRD", "Dólar surinamés", "Surinam"},
                {"SSP", "Libra sursudanesa", "Sudán del Sur"},
                {"STN", "Dobra de Santo Tomé y Príncipe", "Santo Tomé y Príncipe"},
                {"SYP", "Libra siria", "Siria"},
                {"SZL", "Lilangeni de Suazilandia", "Suazilandia"},
                {"THB", "Baht tailandés", "Tailandia"},
                {"TJS", "Somoni tayiko", "Tayikistán"},
                {"TMT", "Manat turcomano", "Turkmenistán"},
                {"TND", "Dinar tunecino", "Túnez"},
                {"TOP", "Paʻanga tongano", "Tonga"},
                {"TRY", "Lira turca", "Turquía"},
                {"TTD", "Dólar de Trinidad y Tobago", "Trinidad y Tobago"},
                {"TVD", "Dólar de Tuvalu", "Tuvalu"},
                {"TWD", "Nuevo dólar taiwanés", "Taiwán"},
                {"TZS", "Chelín tanzano", "Tanzania"},
                {"UAH", "Grivna ucraniana", "Ucrania"},
                {"UGX", "Chelín ugandés", "Uganda"},
                {"USD", "Dólar estadounidense", "Estados Unidos"},
                {"UYU", "Peso uruguayo", "Uruguay"},
                {"UZS", "Som uzbeko", "Uzbekistán"},
                {"VES", "Bolívar venezolano", "Venezuela"},
                {"VND", "Dong vietnamita", "Vietnam"},
                {"VUV", "Vatu vanuatuense", "Vanuatu"},
                {"WST", "Tala samoano", "Samoa"},
                {"XAF", "Franco CFA de África Central", "CEMAC"},
                {"XCD", "Dólar del Caribe Oriental", "Organización de Estados del Caribe Oriental"},
                {"XDR", "Derechos especiales de giro", "Fondo Monetario Internacional"},
                {"XOF", "Franco CFA de África Occidental", "CFA"},
                {"XPF", "Franco CFP", "Colectividades de Ultramar"},
                {"YER", "Rial yemení", "Yemen"},
                {"ZAR", "Rand sudafricano", "Sudáfrica"},
                {"ZMW", "Kwacha zambiano", "Zambia"},
                {"ZWL", "Dólar zimbabuense", "Zimbabue"}
        };
        for (String[] row : data) {
            Moneda moneda = new Moneda(row[1], row[0], row[2]);
            Pais pais = new Pais(row[2], moneda);
            PaisesRegistrados.add(pais);
            monedasAceptadas.add(moneda);
        }
    }
    public Moneda buscarMonedaPorPais(String nombrePais,List<Moneda> monedasAceptadas) {
        for (Moneda moneda : monedasAceptadas) {
            if (moneda.getPais().equalsIgnoreCase(nombrePais)) {
                return moneda;
            }
        }
        return null; // Si no se encuentra la moneda para el país especificado
    }

    public Moneda buscarMonedaPorMoneda(String nombreMoneda,List<Moneda> monedasAceptadas) {
        for (Moneda moneda : monedasAceptadas) {
            if (moneda.getNombreMoneda().equalsIgnoreCase(nombreMoneda)){
                return moneda;
            }
        }
        return null; // Si no se encuentra la moneda para el país especificado
    }
}
