import React from 'react';
import ReactDOM from 'react-dom';


function FormattedDate(props){
    return<h2>it is {props.date.toLocaleTimeString()}.</h2>;

}

class Clock extends React.Component{
    constructor(props){
        super(props);
        this.state = {date : new Date()};
    }

    componentDidMount(){
        this.timerID = setInterval(
            () => this.tick(),
            1000
        );
    }

    componentWillUnnmount(){
        clearInterval(this.timerID);
    }

    tick(){
        this.setState({
            date : new Date()
        });
    }

    render(){
        return(
            <div>
                <h1> Helooo world!!!!</h1>
                <FormattedDate date={this.state.date}/>

            </div>
        );
    }
}

function App(){
    return(
        <div>
            <Clock />
            <Clock />
            <Clock />

        </div>
    );
}

ReactDOM.render(<App />, document.getElementById('root'));

export default Clock;