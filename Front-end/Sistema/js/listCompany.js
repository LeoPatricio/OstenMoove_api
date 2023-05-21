fetch("http://localhost:8080/empresas")
  .then(function(response) {
    if (response.ok) {
      return response.json();
    } else {
      throw new Error("Erro ao consultar os dados da tabela.");
    }
  })
  .then(function(data) {
    var tableBody = document.getElementById("data-body");
    console.log(data);
    data.content.forEach(function(item) {
      var row = document.createElement("tr");
      row.innerHTML = `
        <td>${item.id}</td>
        <td>${item.name}</td>
        <td>${item.cnpj}</td>
      `;
      tableBody.appendChild(row);
    });
  })
  .catch(function(error) {
    console.log(error);
    alert("Ocorreu um erro ao consultar os dados da tabela.");
  });



var detailsButton = document.querySelector('.details-button');
var modal = document.getElementById('modal');
var modalContent = document.getElementById('modal-content');


detailsButton.addEventListener('click', function() {
  var companyId = this.getAttribute('data-id');
  
  // Exemplo de preenchimento do modal com dados
  var companyName = "Exemplo Empresa";
  var cnpj = "00.000.000/0001-00";
  var address = "Rua Exemplo, 123";
  
  modalContent.innerHTML = `
    <p>Nome: ${companyName}</p>
    <p>CNPJ: ${cnpj}</p>
    <p>Endereço: ${address}</p>
  `;
  
  
  modal.style.display = "block";
});

var closeBtn = document.querySelector('.close');
closeBtn.addEventListener('click', function() {
  modal.style.display = "none";
});