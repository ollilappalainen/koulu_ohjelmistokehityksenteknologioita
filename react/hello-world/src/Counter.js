import React, { Component } from 'react';

class Counter extends Component {
    constructor() {
        super();
        this.state = {
            value: 0,
            intervalId: 0,
        }
    }

    increment = () => {
        this.setState({value: this.state.value + 1});
    }

    handleClick = () => {
        let intervalId = setInterval(this.increment, 1000);
        this.setState({intervalId:intervalId});
    }

    render() {
        return (
            <div>
                <p1>Counter {this.state.value}</p1>
                <button onClick={this.handleClick}>START!</button>
            </div>
        )
    }
}

export default Counter;