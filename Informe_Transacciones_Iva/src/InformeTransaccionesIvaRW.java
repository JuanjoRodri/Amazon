import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import dto.InformeTransIva;



public class InformeTransaccionesIvaRW {
	
	static ArrayList<InformeTransIva> manejoCaracteristicasCSV = new ArrayList <>();
	
	public  void inicio () {
		archivoCSV(manejoCaracteristicasCSV);
		nuevoCSV(manejoCaracteristicasCSV);
	}
	public  void nuevoCSV (ArrayList<InformeTransIva> manejoCaracteristicasCSV) {
		String csvFile = "C:\\Users\\juanj\\Desktop\\Proyecto Amazon\\PruebaProgramacion\\PruebaInformeMensual.csv";
		try {
			
			FileWriter fw = new FileWriter(csvFile);
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println("ACTIVITY_PERIOD,SALES_CHANNEL,MARKETPLACE,TRANSACTION_EVENT_ID,TAX_CALCULATION_DATE,TRANSACTION_DEPART_DATE,TRANSACTION_COMPLETE_DATE,SELLER_SKU,ASIN,QTY,PRICE_OF_ITEMS_AMT_VAT_EXCL,PROMO_PRICE_OF_ITEMS_AMT_VAT_EXCL,TOTAL_PRICE_OF_ITEMS_AMT_VAT_EXCL,SHIP_CHARGE_AMT_VAT_EXCL,PROMO_SHIP_CHARGE_AMT_VAT_EXCL,TOTAL_SHIP_CHARGE_AMT_VAT_EXCL,TOTAL_ACTIVITY_VALUE_AMT_VAT_EXCL,PRICE_OF_ITEMS_VAT_RATE_PERCENT,PRICE_OF_ITEMS_VAT_AMT,PROMO_PRICE_OF_ITEMS_VAT_AMT,TOTAL_PRICE_OF_ITEMS_VAT_AMT,SHIP_CHARGE_VAT_RATE_PERCENT,SHIP_CHARGE_VAT_AMT,PROMO_SHIP_CHARGE_VAT_AMT,TOTAL_SHIP_CHARGE_VAT_AMT,TOTAL_ACTIVITY_VALUE_VAT_AMT,PRICE_OF_ITEMS_AMT_VAT_INCL,PROMO_PRICE_OF_ITEMS_AMT_VAT_INCL,TOTAL_PRICE_OF_ITEMS_AMT_VAT_INCL,SHIP_CHARGE_AMT_VAT_INCL,PROMO_SHIP_CHARGE_AMT_VAT_INCL,TOTAL_SHIP_CHARGE_AMT_VAT_INCL,TOTAL_ACTIVITY_VALUE_AMT_VAT_INCL,SALE_ARRIVAL_COUNTRY,VAT_INV_NUMBER,INVOICE_URL");
					
			
			for (InformeTransIva caracteristicas : manejoCaracteristicasCSV) {
			    pw.println(
			    		caracteristicas.getActivityPeriod() + "," +
			    		caracteristicas.getMarketplace() + "," +
			            caracteristicas.getTransactionEventId() + "," +
			            caracteristicas.getTaxCalculationDate() + "," +
			            caracteristicas.getTransactionDepartDate()+ "," +
			            caracteristicas.getTransactionCompleteDate() + "," +
			            caracteristicas.getSellerSku() + "," +
			            caracteristicas.getAsin() + "," +
			            caracteristicas.getQty() + "," +
			            caracteristicas.getPriceOfItemsAmtVatExcl() + "," +
			            caracteristicas.getPromoPriceOfItemsAmtVatExcl() + "," +
			            caracteristicas.getTotalPricceOfItemsAmtVatExcl() + "," +
			            caracteristicas.getShipChargeAmtVatExcl() + "," +
			            caracteristicas.getPromoShipChargeAmtVatExcl() + "," +
			            caracteristicas.getTotalShipChargeAmtVatExcl() + "," +
			            caracteristicas.getTotalActivityValueAmtVatExcl() + "," +
			            caracteristicas.getPriceOfItemsVatRatePercent() + "," +
			            caracteristicas.getPriceOfItemsVatAmt() + "," +
			            caracteristicas.getPromoPriceOfItemsVatAmt() + "," +
			            caracteristicas.getTotalPriceOfItemsVatAmt() + "," +
			            caracteristicas.getShipChargeVatRatePercent() + "," +
			            caracteristicas.getShipChargeVatAmt() + "," +
			            caracteristicas.getPromoShipChargeVatAmt() + "," +
			            caracteristicas.getTotalShipChargeVatAmt() + "," +
			            caracteristicas.getTotalActivityValueVatAmt() + "," +
			            caracteristicas.getPriceOfItemsAmtVatIncl() + "," +
			            caracteristicas.getPromoPriceOfItemsAmtVatIncl() + "," +
			            caracteristicas.getTotalPriceOfItemsAmtVatIncl() + "," +
			            caracteristicas.getShipChargeAmtVatIncl() + "," +
			            caracteristicas.getPromoShipChargeAmtVatIncl() + "," +
			            caracteristicas.getTotalShipChargeAmtVatIncl() + "," +
			            caracteristicas.getTotalActivityValueAmtVatIncl() + "," +
			            caracteristicas.getSaleArrivalCountry() + "," +
			            caracteristicas.getInvoiceUrl() + ",");
			}
			
			pw.close();
			System.out.println("Se ha creado el archivo csv correctamente");
		} catch (Exception e) {
			System.out.println("Error al escribir en el archivo CSV");
			e.printStackTrace();
		}
		
	}

	public static void archivoCSV (ArrayList <InformeTransIva> manejoCaracteristicasCSV) {
		try(BufferedReader br = new BufferedReader ( new FileReader("C:\\Users\\juanj\\Desktop\\Proyecto Amazon\\PruebaProgramacion\\81164019915.csv"))){
			String linea;
			linea = br.readLine();
			while((linea = br.readLine())!= null) {
				String[] datos = linea.split (",");
				String activity_period = datos[1];
				String marketplace = datos [3];
				String transaction_event_id = datos [6];
				String tax_calculation_date = datos [8];
				String transaction_depart_date = datos [9];
				String transaction_complete_date = datos [11];
				String seller_sku = datos [12];
				String asin = datos[13];
				String qty = datos[16];
				String price_of_items_amt_vat_excl = datos[20];
				String promo_price_of_items_amt_vat_excl = datos[21];
				String total_pricce_of_items_amt_vat_excl = datos[22];
				String ship_charge_amt_vat_excl = datos[23];
				String promo_ship_charge_amt_vat_excl = datos[24];
				String total_ship_charge_amt_vat_excl = datos[25];
				String total_activity_value_amt_vat_excl = datos[29];
				String price_of_items_vat_rate_percent = datos[30];
				String price_of_items_vat_amt = datos[31];
				String promo_price_of_items_vat_amt = datos[32];
				String total_price_of_items_vat_amt = datos[33];
				String ship_charge_vat_rate_percent = datos[34];
				String ship_charge_vat_amt = datos[35];
				String promo_ship_charge_vat_amt = datos[36];
				String total_ship_charge_vat_amt = datos[37];
				String total_activity_value_vat_amt = datos[42];
				String price_of_items_amt_vat_incl = datos[43];
				String promo_price_of_items_amt_vat_incl = datos[44];
				String total_price_of_items_amt_vat_incl = datos[45];
				String ship_charge_amt_vat_incl = datos[46];
				String promo_ship_charge_amt_vat_incl = datos[47];
				String total_ship_charge_amt_vat_incl = datos[48];
				String total_activity_value_amt_vat_incl = datos[68];
				String sale_arrival_country = datos[82];
				String invoice_url = datos[88];
				
				InformeTransIva llamada =  new InformeTransIva (activity_period, marketplace, transaction_event_id, tax_calculation_date, transaction_depart_date, transaction_complete_date, seller_sku,
						asin, qty, price_of_items_amt_vat_excl, promo_price_of_items_amt_vat_excl, total_pricce_of_items_amt_vat_excl, ship_charge_amt_vat_excl, promo_ship_charge_amt_vat_excl,
						total_ship_charge_amt_vat_excl, total_activity_value_amt_vat_excl, price_of_items_vat_rate_percent, price_of_items_vat_amt, promo_price_of_items_vat_amt,
						total_price_of_items_vat_amt, ship_charge_vat_rate_percent, ship_charge_vat_amt, promo_ship_charge_vat_amt, total_ship_charge_vat_amt, total_activity_value_vat_amt,
						price_of_items_amt_vat_incl, promo_price_of_items_amt_vat_incl, total_price_of_items_amt_vat_incl, ship_charge_amt_vat_incl, promo_ship_charge_amt_vat_incl,
						total_ship_charge_amt_vat_incl, total_activity_value_amt_vat_incl, sale_arrival_country, invoice_url);
				manejoCaracteristicasCSV.add(llamada);
			}
				
		}catch(IOException e) {
			System.out.println("Error no se encontró el archjivo o tiene errores");
			System.out.println(e);
		}
	}
	
}
