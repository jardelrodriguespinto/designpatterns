package br.com.product.enums;

public enum Status
{
    APROVADO("Aprovado"),
    REPROVADO("Reprovado");

    private String descricao;

    Status(String descricao)
    {
        this.descricao = descricao;
    }

    public String getDescricao()
    {
        return this.descricao;
    }
}
