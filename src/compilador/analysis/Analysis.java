/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.analysis;

import compilador.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseTNumero(TNumero node);
    void caseTNumerooctal(TNumerooctal node);
    void caseTNumerohexa(TNumerohexa node);
    void caseTCommentLine(TCommentLine node);
    void caseTComentBloco(TComentBloco node);
    void caseTNomePrograma(TNomePrograma node);
    void caseTString(TString node);
    void caseTEspaco(TEspaco node);
    void caseTQuebra(TQuebra node);
    void caseTIdentacao(TIdentacao node);
    void caseTAdicao(TAdicao node);
    void caseTSubtracao(TSubtracao node);
    void caseTBarra(TBarra node);
    void caseTEstrela(TEstrela node);
    void caseTMenor(TMenor node);
    void caseTMenorIgual(TMenorIgual node);
    void caseTMaior(TMaior node);
    void caseTMaiorIgual(TMaiorIgual node);
    void caseTSeta(TSeta node);
    void caseTIgualIgual(TIgualIgual node);
    void caseTDiferente(TDiferente node);
    void caseTIgual(TIgual node);
    void caseTDelimitador(TDelimitador node);
    void caseTVirgula(TVirgula node);
    void caseTAbreParen(TAbreParen node);
    void caseTFechaParen(TFechaParen node);
    void caseTAbreColchete(TAbreColchete node);
    void caseTFechaColchete(TFechaColchete node);
    void caseTAbreChave(TAbreChave node);
    void caseTFechaChave(TFechaChave node);
    void caseTAbreComent(TAbreComent node);
    void caseTFechaComent(TFechaComent node);
    void caseTPonto(TPonto node);
    void caseTDoispontos(TDoispontos node);
    void caseTAndLogico(TAndLogico node);
    void caseTOrLogico(TOrLogico node);
    void caseTNotLogico(TNotLogico node);
    void caseTDeclaracaoAtribuicao(TDeclaracaoAtribuicao node);
    void caseTEllipsis(TEllipsis node);
    void caseTDefault(TDefault node);
    void caseTCase(TCase node);
    void caseTIf(TIf node);
    void caseTElse(TElse node);
    void caseTFunc(TFunc node);
    void caseTDefer(TDefer node);
    void caseTReturn(TReturn node);
    void caseTRange(TRange node);
    void caseTSwitch(TSwitch node);
    void caseTFor(TFor node);
    void caseTFallthrough(TFallthrough node);
    void caseTVar(TVar node);
    void caseTConst(TConst node);
    void caseTBool(TBool node);
    void caseTInt32(TInt32 node);
    void caseTInt64(TInt64 node);
    void caseTTipo(TTipo node);
    void caseTIdentificador(TIdentificador node);
    void caseTCharIgnored(TCharIgnored node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
