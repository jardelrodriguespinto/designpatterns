package br.com.product.adapter;

public class UsbAdapter implements UsbC
{
    private UsbA usbA;
    public UsbAdapter(UsbA usbA)
    {
        this.usbA = usbA;
    }
    @Override
    public void carregando() {
        usbA.carregando();
    }
}
