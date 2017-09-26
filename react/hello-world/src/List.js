import React, {Component} from 'react';

class List extends Component {
    constructor() {
        super();
        this.state = {
            list : [],
            listItem: null,
        }
    }

    componentDidMount() {
        const lista = ["Item1", "Item2", "Item3", "Item4"];
        const asiaLista = lista.map((asia) =>
            <li key={asia}>
                Asia {asia}
            </li>
        );
        this.setState({listItem: asiaLista});
    }

    render() {
        return (
            <div>
                {this.componentDidMount}
            </div>
        )
    }
}

export default List;