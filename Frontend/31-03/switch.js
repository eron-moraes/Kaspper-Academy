var tipoUsuario = 'supervisor';


switch (tipoUsuario) {
  case 'admin':
    console.log('Acesso a todos os módulos');
    break;
  case 'supervisor':
    console.log('Acesso apenas a relatórios');
    break;
  case 'desenvolvedor':
    console.log('Acesso a todos os módulos e possibilidade de deletar todas as tabelas do sistema');
    break;
  case 'operador':
    console.log('Acesso apenas a cadastro e movimentações');
    break;
  default:
    console.log('Tipo de usuário desconhecido');
}